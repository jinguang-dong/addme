package defpackage;

import java.io.File;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pqe {
    public final ppx a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public pqe() {
        throw null;
    }

    public static pqe a(ppx ppxVar, String str, String str2, String str3, String str4) {
        String strY;
        boolean z = true;
        if (!rnt.V(str4) && !"text/plain".equals(str4) && !"application/octet-stream".equals(str4) && ((strY = prh.y(str3)) == null || !strY.equals(str4))) {
            z = false;
        }
        a.I(z);
        rnt.I(ppxVar.c(str4), "Cannot publish %s to %s", str4, ppxVar);
        return new pqe(ppxVar, str, str2, str3, str4);
    }

    final File b(ppu ppuVar) {
        File fileA = this.a.a(ppuVar.a);
        String str = this.b;
        if (!rnt.V(str)) {
            fileA = new File(fileA, str);
        }
        return new File(fileA, this.c + "." + this.d);
    }

    final boolean c() {
        ppx ppxVar = this.a;
        return ppxVar.b() && ppxVar.c(this.e);
    }

    public final void d() {
        rnt.V(this.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pqe) {
            pqe pqeVar = (pqe) obj;
            if (this.a.equals(pqeVar.a) && this.b.equals(pqeVar.b) && this.c.equals(pqeVar.c) && this.d.equals(pqeVar.d) && this.e.equals(pqeVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        return this.e.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String string = this.a.toString();
        String str = this.b;
        return String.format(locale, "%s/%s%s.%s (%s)", string, rnt.V(str) ? "" : str.concat("/"), this.c, this.d, this.e);
    }

    public pqe(ppx ppxVar, String str, String str2, String str3, String str4) {
        ppxVar.getClass();
        this.a = ppxVar;
        str.getClass();
        this.b = str;
        this.c = str2;
        str3.getClass();
        this.d = str3;
        this.e = str4;
    }
}
