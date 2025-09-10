package defpackage;

import android.net.Uri;
import com.google.android.apps.camera.ui.zoomlock.Gx.nWEkBGOQPWQp;
import com.google.vr.audio.Cf.qcjAcSmlN;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pxe {
    public final Uri a;
    public final String b;
    public final pxc c;
    public final int d;
    public final sbp e;
    public final rwc f;
    private final tnw g;

    public pxe() {
        throw null;
    }

    public static pxd a() {
        pxd pxdVar = new pxd(null);
        pxdVar.f(-1);
        int i = sbp.d;
        pxdVar.d(sex.a);
        pxdVar.b(tnw.a);
        return pxdVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pxe) {
            pxe pxeVar = (pxe) obj;
            if (this.a.equals(pxeVar.a) && this.b.equals(pxeVar.b) && this.c.equals(pxeVar.c) && this.d == pxeVar.d && ujp.aH(this.e, pxeVar.e) && this.f.equals(pxeVar.f) && this.g.equals(pxeVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iJ;
        int iHashCode = ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
        tnw tnwVar = this.g;
        if (tnwVar.C()) {
            iJ = tnwVar.j();
        } else {
            int iJ2 = tnwVar.aT;
            if (iJ2 == 0) {
                iJ2 = tnwVar.j();
                tnwVar.aT = iJ2;
            }
            iJ = iJ2;
        }
        return iJ ^ (iHashCode * 1000003);
    }

    public pxe(Uri uri, String str, pxc pxcVar, int i, sbp sbpVar, rwc rwcVar, tnw tnwVar) {
        this.a = uri;
        this.b = str;
        this.c = pxcVar;
        this.d = i;
        this.e = sbpVar;
        this.f = rwcVar;
        this.g = tnwVar;
    }

    public final String toString() {
        tnw tnwVar = this.g;
        rwc rwcVar = this.f;
        sbp sbpVar = this.e;
        pxc pxcVar = this.c;
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(pxcVar);
        String strValueOf3 = String.valueOf(sbpVar);
        String strValueOf4 = String.valueOf(rwcVar);
        String strValueOf5 = String.valueOf(tnwVar);
        StringBuilder sb = new StringBuilder(nWEkBGOQPWQp.MWSQ);
        sb.append(strValueOf);
        String str = qcjAcSmlN.cGgnKR;
        sb.append(str);
        sb.append(this.b);
        sb.append(str);
        sb.append(strValueOf2);
        sb.append(str);
        sb.append(this.d);
        sb.append(str);
        sb.append(strValueOf3);
        sb.append(str);
        sb.append(strValueOf4);
        sb.append(str);
        sb.append(strValueOf5);
        sb.append("}");
        return sb.toString();
    }
}
