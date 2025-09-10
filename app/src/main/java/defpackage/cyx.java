package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cyx {
    private final String[] a;
    private boolean b;
    private boolean c;

    public cyx(String... strArr) {
        this.a = strArr;
    }

    public final synchronized boolean a() {
        if (this.b) {
        } else {
            this.b = true;
            try {
                System.loadLibrary(this.a[0]);
                this.c = true;
            } catch (UnsatisfiedLinkError unused) {
                cyy.b("LibraryLoader", "Failed to load ".concat(String.valueOf(Arrays.toString(this.a))));
            }
        }
        return this.c;
    }
}
