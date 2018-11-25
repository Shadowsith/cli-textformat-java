// MIT License, Copyright (c) 2018 Philip Mayer <philip.mayer@shadowsith.de>

public class Textformat {

    private static String begin = "\033[";
    private static String end = "\033[0m";
    private static String multilineEnd = "\033[0a";
    private static String reset = "0m";
    private static String bold = "1m";
    private static String underline = "4m";
    private static String inverse = "7m";
    private static String boldOff = "21m";
    private static String underlineOff = "24m";
    private static String inverseOff = "27m";

    // foreground

    public static String black(String text) {
        return begin + FormatColor.Fg.black + text + end;
    }

    public static String black(String text, boolean multiline) {
        if (multiline == true) 
            return begin + FormatColor.Fg.black + text + multilineEnd; 
        else
            return begin + FormatColor.Fg.black + text + end; 
    }

    public static String red(String text) {
        return begin + FormatColor.Fg.red + text + end;
    }

    public static String red(String text, boolean multiline) {
        if (multiline == true) 
            return begin + FormatColor.Fg.red + text + multilineEnd; 
        else
            return begin + FormatColor.Fg.red + text + end; 
    }

    public static String green(String text) {
        return begin + FormatColor.Fg.green + text + end;
    }

    public static String green(String text, boolean multiline) {
        if (multiline == true)
            return begin + FormatColor.Fg.green + text + multilineEnd; 
        else
            return begin + FormatColor.Fg.green + text + end; 
    }

    public static String yellow(String text) {
        return begin + FormatColor.Fg.yellow + text + end;
    }

    public static String yellow(String text, boolean multiline) {
        if (multiline == true)
            return begin + FormatColor.Fg.yellow + text + multilineEnd; 
        else
            return begin + FormatColor.Fg.yellow + text + end; 
    }

    public static String blue(String text) {
        return begin + FormatColor.Fg.blue + text + end;
    }

    public static String blue(String text, boolean multiline) {
        if (multiline == true)
            return begin + FormatColor.Fg.blue + text + multilineEnd; 
        else
            return begin + FormatColor.Fg.blue + text + end; 
    }

    public static String magenta(String text) {
        return begin + FormatColor.Fg.magenta + text + end;
    }

    public static String magenta(String text, boolean multiline) {
        if (multiline == true)
            return begin + FormatColor.Fg.magenta + text + multilineEnd; 
        else
            return begin + FormatColor.Fg.magenta + text + end; 
    }

    public static String cyan(String text) {
        return begin + FormatColor.Fg.cyan + text + end;
    }

    public static String cyan(String text, boolean multiline) {
        if (multiline == true)
            return begin + FormatColor.Fg.cyan + text + multilineEnd; 
        else
            return begin + FormatColor.Fg.cyan + text + end; 
    }

    public static String white(String text) {
        return begin + FormatColor.Fg.white + text + end;
    }

    public static String white(String text, boolean multiline) {
        if (multiline == true)
            return begin + FormatColor.Fg.white + text + multilineEnd; 
        else
            return begin + FormatColor.Fg.white + text + end; 
    }

    // background

    public static String blackBg(String text) {
        return begin + FormatColor.Bg.black + text + end;
    }

    public static String blackBg(String text, boolean multiline) {
        if (multiline == true) 
            return begin + FormatColor.Bg.black + text + multilineEnd; 
        else
            return begin + FormatColor.Bg.black + text + end; 
    }

    public static String redBg(String text) {
        return begin + FormatColor.Bg.red + text + end;
    }

    public static String redBg(String text, boolean multiline) {
        if (multiline == true) 
            return begin + FormatColor.Bg.red + text + multilineEnd; 
        else
            return begin + FormatColor.Bg.red + text + end; 
    }

    public static String greenBg(String text) {
        return begin + FormatColor.Bg.green + text + end;
    }

    public static String greenBg(String text, boolean multiline) {
        if (multiline == true)
            return begin + FormatColor.Bg.green + text + multilineEnd; 
        else
            return begin + FormatColor.Bg.green + text + end; 
    }

    public static String yellowBg(String text) {
        return begin + FormatColor.Bg.yellow + text + end;
    }

    public static String yellowBg(String text, boolean multiline) {
        if (multiline == true)
            return begin + FormatColor.Bg.yellow + text + multilineEnd; 
        else
            return begin + FormatColor.Bg.yellow + text + end; 
    }

    public static String blueBg(String text) {
        return begin + FormatColor.Bg.blue + text + end;
    }

    public static String blueBg(String text, boolean multiline) {
        if (multiline == true)
            return begin + FormatColor.Bg.blue + text + multilineEnd; 
        else
            return begin + FormatColor.Bg.blue + text + end; 
    }

    public static String magentaBg(String text) {
        return begin + FormatColor.Bg.magenta + text + end;
    }

    public static String magentaBg(String text, boolean multiline) {
        if (multiline == true)
            return begin + FormatColor.Bg.magenta + text + multilineEnd; 
        else
            return begin + FormatColor.Bg.magenta + text + end; 
    }

    public static String cyanBg(String text) {
        return begin + FormatColor.Bg.cyan + text + end;
    }

    public static String cyanBg(String text, boolean multiline) {
        if (multiline == true)
            return begin + FormatColor.Bg.cyan + text + multilineEnd; 
        else
            return begin + FormatColor.Bg.cyan + text + end; 
    }

    public static String whiteBg(String text) {
        return begin + FormatColor.Bg.white + text + end;
    }

    public static String whiteBg(String text, boolean multiline) {
        if (multiline == true)
            return begin + FormatColor.Bg.white + text + multilineEnd; 
        else
            return begin + FormatColor.Bg.white + text + end; 
    }

    // formatting
    public static String bold(String text) {
        return begin + bold + text + end; 
    }

    public static String bold(String text, boolean multiline) {
        if (multiline == true)
            return begin + bold + text + multilineEnd; 
        else
            return begin + bold + text + end; 
    }

    public static String disableMultiline(String text, boolean multiline) {
        return end; 
    }

    public static String inverse(String text) {
        return begin + inverse + text + end; 
    }

    public static String inverse(String text, boolean multiline) {
        if (multiline == true)
            return begin + inverse + text + multilineEnd; 
        else
            return begin + inverse + text + end; 
    }

    public static String underline(String text) {
        return begin + underline + text + end; 
    }

    public static String underline(String text, boolean multiline) {
        if (multiline == true)
            return begin + underline + text + multilineEnd; 
        else
            return begin + underline + text + end; 
    }
}

// not named Color to avoid package conflicts
class FormatColor {
    static class Fg {
        static String black = "30m";
        static String red = "31m";
        static String green = "32m";
        static String yellow = "33m";
        static String blue = "34m";
        static String magenta = "35m";
        static String cyan = "36m";
        static String white = "37m";
    }

    static class Bg {
        static String black = "40m";
        static String red = "41m";
        static String green = "42m";
        static String yellow = "43m";
        static String blue = "44m";
        static String magenta = "45m";
        static String cyan = "46m";
        static String white = "47m";
    }
}


