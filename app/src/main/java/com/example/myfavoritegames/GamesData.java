package com.example.myfavoritegames;

import java.util.ArrayList;

public class GamesData {
    private static String[] gameNames = {
            "Assassins Creed Brotherhood",
            "Assassins Creed Origins",
            "Dota 2",
            "Fallout New Vegas",
            "Kingdom Hearts 2",
            "Kingdom Hearts 3",
            "Naruto Ultimate Ninja Storm 4",
            "Naruto Ultimate Ninja Storm 3",
            "Skyrim",
            "The Witcher 3"
    };

    private static String[] gameDetail = {
            "Assassin's Creed: Brotherhood is a 2010 action-adventure video game developed by Ubisoft Montreal and published by Ubisoft.",
            "Assassin's Creed Origins is an action-adventure video game developed by Ubisoft Montreal and published by Ubisoft.",
            "Dota 2 is a multiplayer online battle arena (MOBA) video game developed and published by Valve Corporation. ",
            "Kingdom Hearts II is a 2005 action role-playing game developed and published by Square Enix",
            "Fallout: New Vegas is a post-apocalyptic action role-playing video game. It is a spin-off of the Fallout series and was developed by Obsidian Entertainment",
            "Kingdom Hearts III is a 2019 action role-playing game developed and published by Square Enix",
            "Naruto Shippuden: Ultimate Ninja Storm 4 is a fighting game developed by CyberConnect2",
            "Naruto Shippuden: Ultimate Ninja Storm 3 is a fighting game developed by CyberConnect2",
            "The Elder Scrolls V: Skyrim is an action role-playing video game developed by Bethesda Game Studios",
            "The Witcher 3: Wild Hunt[a] is a 2015 action role-playing game developed and published by CD Projekt"
    };

    private static String[] gamePlatform = {
            "PlayStation 3\n" + "Xbox 360\n" + "Microsoft Windows\n" + "Mac OS X\n" + "PlayStation 4\n" + "Xbox One",
            "Microsoft Windows\n" + "PlayStation 4\n" + "Xbox One",
            "Microsoft Windows\n" + "Linux\n" + "OS X",
            "Microsoft Windows\n" + "PlayStation 3\n" + "Xbox 360",
            "PlayStation 2",
            "PlayStation 4, Xbox One",
            "PlayStation 3\n" + "Xbox 360\n" + "Microsoft Windows\n" + "PlayStation 4\n" + "Xbox One\n" + "Nintendo Switch",
            "Microsoft Windows\n" + "PlayStation 4\n" + "Xbox One",
            "Microsoft Windows\nPlayStation 3\nXbox 360\nPlayStation 4\n Xbox One\nNintendo Switch",
            "Microsoft Windows\n" + "PlayStation 4\n" + "Xbox One\n" + "Nintendo Switch"
    };

    private static String[] gameDeveloper = {
            "Ubisoft Montreal",
            "Ubisoft Montreal",
            "Valve Coorporation",
            "Obsidian Entertainment",
            "Square Enix",
            "Square Enix",
            "CyberConnect2",
            "CyberConnect2",
            "Bethesda Game Studios",
            "CD Projekt Red"
    };

    private static String[] gamePublisher ={
            "Ubisoft",
            "Ubisoft",
            "Valve Coorporation",
            "Bethesda Softwork",
            "Square Enix",
            "Square Enix",
            "Namco Bandai Games",
            "Namco Bandai Games",
            "Bethesda Softwork",
            "CD Projekt"
    };

    private static String[] gameModes={
            "Single-player, multiplayer",
            "Single-player",
            "Multiplayer",
            "Single-player",
            "Single-player",
            "Single-player",
            "Single-player, multiplayer",
            "Single-player, multiplayer",
            "Single-player",
            "Single-player"
    };

    private static String[] gameRelease = {
            "November 16, 2010",
            "October 27, 2017",
            "July 9, 2013",
            "October 19, 2010",
            "December 22, 2005",
            "January 29, 2019",
            "March 5, 2013",
            "February 5, 2016",
            "November 11, 2011",
            "19 May 2015"
    };

    private static String[] gameGenre = {
            "Action-adventure, stealth",
            "Action-adventure, stealth",
            "MOBA",
            "Action role-playing",
            "Action role-playing",
            "Action role-playing",
            "Fighting Game, action",
            "Fighting Game, action",
            "Action role-playing",
            "Action role-playing"

    };
    private static int[] gamesImages = {
            R.drawable.acbrotherhood,
            R.drawable.acorigins,
            R.drawable.dota2,
            R.drawable.falloutnewvegas,
            R.drawable.kingdomhearts2,
            R.drawable.kingdomherts3,
            R.drawable.narutostorm4,
            R.drawable.narutostrom3,
            R.drawable.skyrim,
            R.drawable.thewitcher3
    };

    public static ArrayList<Games> getListData() {
        ArrayList<Games> list = new ArrayList<>();
        for (int position = 0; position < gameNames.length; position++) {
            Games games = new Games();
            games.setGameName(gameNames[position]);
            games.setGameGenre(gameGenre[position]);
            games.setGameModes(gameModes[position]);
            games.setGamePlatform(gamePlatform[position]);
            games.setGamePublisher(gamePublisher[position]);
            games.setGameRelease(gameRelease[position]);
            games.setGameDev(gameDeveloper[position]);
            games.setGameDetail(gameDetail[position]);
            games.setGamePhoto(gamesImages[position]);
            list.add(games);
        }
        return list;
    }
}
