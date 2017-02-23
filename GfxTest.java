public class GfxTest
{
    

    // public static void main(String[] args)
    // {
    //     clearScreen();
    //     //snX snY raX raY
    //     System.out.println("her kommer jeg");
    //     System.out.println("1");
    //     writeBoard(3,3,4,4);
    //     System.out.println("2fejl");
    //     writeBoard(4,4,4,4);
    //     System.out.println("3");
    //     writeBoard(4,1,2,1);
    //     System.out.println("4");
    //     writeBoard(1,1,9,1);
    //     System.out.println("5");
    //     writeBoard(5,10,10,5);
        
        

    //     // test(50);

        
    // }
    
    public static void clearScreen() 
    {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    public static void writeBoard(int snakeX, int sY, int rabbitX, int rY) 
    {   
        //start med at clear skærm
        // clearScreen();
        int snakeY = 11 - sY;
        int rabbitY = 11 - rY;
        

        if (snakeY == rabbitY) // snake & rabbit on same line
        {
            //empty lines
            emptyLinesFromUntil(0 , rabbitY);
            
            if (snakeX < rabbitX) //snake -> rabbit line
            {
                emptySpacesFromUntil(0, snakeX);
                snake();
                emptySpacesFromUntil(snakeX, rabbitX);
                rabbit();
                emptySpacesFromUntil(rabbitX, 11);
            } 
            else //rabbit -> snake line
            {
                emptySpacesFromUntil(0, rabbitX);
                rabbit();
                emptySpacesFromUntil(rabbitX, snakeX);
                snake();
                emptySpacesFromUntil(snakeX, 11);
            }
            linebreak();
            
            //empty lines
            emptyLinesFromUntil(snakeY, 11);
        } 
        else if(snakeY < rabbitY) //snake line before rabbit line
        {
            //empty lines
            emptyLinesFromUntil(0, snakeY);

            //snake line
            emptySpacesFromUntil(0, snakeX);
            snake();
            emptySpacesFromUntil(snakeX, 11);
            linebreak();

            //empty lines
            emptyLinesFromUntil(snakeY, rabbitY);

            //rabbit line
            emptySpacesFromUntil(0, rabbitX);
            rabbit();
            emptySpacesFromUntil(rabbitX, 11);
            linebreak();

            //empty lines
            emptyLinesFromUntil(rabbitY, 11);
        }
        else if(snakeY > rabbitY) // rabbit line before snake line
        {
            //empty lines
            emptyLinesFromUntil(0, rabbitY);

            //rabbit line
            emptySpacesFromUntil(0, rabbitX);
            rabbit();
            emptySpacesFromUntil(rabbitX, 11);
            linebreak();

            //empty lines
            emptyLinesFromUntil(rabbitY, snakeY);

            //snake line
            emptySpacesFromUntil(0, snakeX);
            snake();
            emptySpacesFromUntil(snakeX, 11);
            linebreak();

            //empty lines
            emptyLinesFromUntil(snakeY, 11);            
        }
        // structure
        linebreak();
        System.out.print("Press enter to continue");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {
            e.printStackTrace();
        }  
    }  
        

    //first argument is not 1 but 0 due to the +1
    //  
    private static void emptySpacesFromUntil(int begin, int x)
    {
        for(int spaceSlot = begin+1 ; spaceSlot < x ; spaceSlot++)
        {
            //print empty space fra begin+1 til x position
            space();
        }
    }

    //first argument is not 1 but 0 due to the +1
    private static void emptyLinesFromUntil(int begin,int y
    ){
        for(int line = begin +1 ; line < y ; line++)
            {
                for(int space = 1 ; space < 11 ; space++)
                {
                    space();
                }

                linebreak();
            }
    }
    
    //print rabbit  
    private static void rabbit()
    {
        System.out.print("BU");
    }

    //print snake
    private static void snake()
    {
        System.out.print("SN");
    }

    //print space
    private static void space()
    {
        System.out.print("__");
    }

    //print linebreak
    private static void linebreak()
    {
        System.out.println();
    }

    public static void test(int times)
    {
        for(int ia = 0; ia < times; ia++)
        {
            for(int ib = 0; ib < times; ib++)
            {
                for(int ic = 0; ic < times; ic++)
                {
                    for(int id = 0; id < times; id++)
                    {
                        writeBoard(ia, ib, ic, id);            
                    }
                }
            }
        }        
    } // end test
} // end gfxTest
