package defpackage;

import java.net.URL;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eux implements eqi {
    public final euy b;
    public final URL c;
    public final String d;
    public String e;
    public URL f;
    private volatile byte[] g;
    private int h;

    public eux(String str) {
        euy euyVar = euy.a;
        this.c = null;
        eoz.h(str);
        this.d = str;
        eoz.k(euyVar);
        this.b = euyVar;
    }

    @Override // defpackage.eqi
    public final void a(MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = b().getBytes(a);
        }
        messageDigest.update(this.g);
    }

    public final String b() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        URL url = this.c;
        eoz.k(url);
        return url.toString();
    }

    @Override // defpackage.eqi
    public final boolean equals(Object obj) {
        if (obj instanceof eux) {
            eux euxVar = (eux) obj;
            if (b().equals(euxVar.b()) && this.b.equals(euxVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.eqi
    public final int hashCode() {
        int i = this.h;
        if (i != 0) {
            return i;
        }
        int iHashCode = b().hashCode();
        this.h = iHashCode;
        int iHashCode2 = (iHashCode * 31) + this.b.hashCode();
        this.h = iHashCode2;
        return iHashCode2;
    }

    public final String toString() {
        return b();
    }

    public eux(URL url) {
        euy euyVar = euy.a;
        eoz.k(url);
        this.c = url;
        this.d = null;
        eoz.k(euyVar);
        this.b = euyVar;
    }
}
