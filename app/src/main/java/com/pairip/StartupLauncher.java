package com.pairip;

/* loaded from: classes.dex */
public final class StartupLauncher {
    private static boolean launchCalled = false;
    private static String startupProgramName = "1kqEF9HcsjujJLfP";

    public static synchronized void launch() {
        if (launchCalled) {
            return;
        }
        launchCalled = true;
        VMRunner.invoke(startupProgramName, null);
    }

    private StartupLauncher() {
    }
}
