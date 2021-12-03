package core.arrays;

public class ArrayExamples {

    private int[] gameMenuItems = {1,2,3,4,5};


    public int[] getGameMenuItems() {
        return gameMenuItems;
    }

    public int getSpecificMenuItem(int menuLocation){
        // NOTE -> Menu location items are immutable index 0-4
        return this.gameMenuItems[menuLocation];
    }

    // the aim of the arguments are to allow a user to select a menu items hence menuNumber
    // Then select the location via moveLocation
    public void moveMenuItem(int menuNumber, int moveLocation){
        // in the below variable I need to capture the menu item from the move location as I do not want to lose it/ overwrite
        int moveLocationStore = this.gameMenuItems[moveLocation];
        // I use the moveLocation as an initialisation for the below variable - check the if statement below where
        // I set the location of the location of the menu item to move
        int menuNumberToMoveLocation = moveLocation;

        // basic loop through array
        for (int i = 0; i < this.gameMenuItems.length; i++) {
            // below statement to check against menu item found
            if (this.gameMenuItems[i] == menuNumber){
                // writing the found item location to the menuNumberToMoveLocation
                menuNumberToMoveLocation = i;
            }
        }

        // move the menu item that has been stored to prevent deletion/overwrite
        this.gameMenuItems[menuNumberToMoveLocation] = moveLocationStore;
        // apply menu item to new location
        this.gameMenuItems[moveLocation] = menuNumber;

    }
}
