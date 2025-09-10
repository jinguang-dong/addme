package defpackage;

import j$.io.FileRetargetClass;
import j$.nio.file.Files;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ihw {
    public static final sgv a = sgv.g("ihw");
    public final ihx b;
    private boolean c;
    private final ues d;

    public ihw(ihx ihxVar) {
        ihxVar.getClass();
        this.b = ihxVar;
        this.c = true;
        this.d = new uez(new dus(this, 6));
    }

    public final long a() {
        return ((Number) this.d.a()).longValue();
    }

    public final long b(File file) {
        byte b;
        if (this.c) {
            try {
                List<String> allLines = Files.readAllLines(FileRetargetClass.toPath(file));
                allLines.getClass();
                if (allLines.size() != 1) {
                    ((sgt) a.c().M(2021)).s("Incorrect line count.");
                    return -1L;
                }
                String str = allLines.get(0);
                str.getClass();
                String str2 = str;
                if (str2.length() == 0) {
                    ((sgt) a.c().M(2020)).v("Empty file (%s).", file.getName());
                    return -1L;
                }
                byte[] bytes = str2.getBytes(ulo.a);
                bytes.getClass();
                if (bytes.length < 2 || bytes[0] != 48 || ((b = bytes[1]) != 120 && b != 88)) {
                    String str3 = "Invalid string " + file.getName() + ".";
                    try {
                        return Long.parseLong(str2);
                    } catch (NumberFormatException e) {
                        ((sgt) a.c().M(2018)).E("%s, reason: %s", str3, e.getMessage());
                        return -1L;
                    }
                }
                String str4 = "Invalid string " + file.getName() + ".";
                try {
                    String strSubstring = str2.substring(2);
                    strSubstring.getClass();
                    return Long.parseLong(strSubstring, 16);
                } catch (NumberFormatException e2) {
                    ((sgt) a.c().M(2017)).E("%s, reason: %s", str4, e2.getMessage());
                    return -1L;
                }
            } catch (IOException e3) {
                ((sgt) a.c().M(2022)).E("Unable to parse unsigned integer (%s), reason: %s.", file.getName(), e3.getMessage());
                if (e3 instanceof uib) {
                    this.c = false;
                }
            }
        }
        return -1L;
    }
}
