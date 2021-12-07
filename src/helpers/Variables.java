package helpers;

import enums.Shell;

public class Variables {
    public static int currentLine;
    public static char separator;
    /**
     * the shell you want to execute commands
     * like: cmd or powershell for windows
     * like: sh or zsh or bash for linux
     */
    public static Shell shell;
    public static final char[] separators = {'/', '\\'};
    public static final char[] questions = {'\'', '\"'};
}
