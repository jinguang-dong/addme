package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbz {
    public final String a;
    public final uiu b;
    public boolean c;

    public cbz(String str, uiu uiuVar) {
        this.a = str;
        this.b = uiuVar;
    }

    public final String toString() {
        return "AccessibilityKey: ".concat(this.a);
    }

    public /* synthetic */ cbz(String str) {
        this(str, cby.a);
    }

    public cbz(String str, byte[] bArr) {
        this(str);
        this.c = true;
    }

    public cbz(String str, boolean z, uiu uiuVar) {
        this(str, uiuVar);
        this.c = z;
    }
}
