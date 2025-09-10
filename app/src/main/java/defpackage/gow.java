package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gow {
    public final String a;
    public int b;
    public int c;
    public int d;
    public int e;
    public long f;
    public int g;

    public gow(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gow)) {
            return false;
        }
        gow gowVar = (gow) obj;
        return this.a.equals(gowVar.a) && this.d == gowVar.d && this.e == gowVar.e && this.c == gowVar.c && this.b == gowVar.b && this.f == gowVar.f && this.g == gowVar.g;
    }
}
