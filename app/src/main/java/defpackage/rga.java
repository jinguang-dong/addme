package defpackage;

import android.graphics.PointF;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rga {
    private rwc A;
    private rwc B;
    public boolean a = false;
    public rgc b;
    public rwc c;
    public rwc d;
    public rwc e;
    public rwc f;
    public rwc g;
    public byte h;
    public int i;
    private rfw j;
    private float k;
    private sbp l;
    private rwc m;
    private rwc n;
    private rwc o;
    private rwc p;
    private rwc q;
    private rwc r;
    private rwc s;
    private rwc t;
    private rwc u;
    private rwc v;
    private rwc w;
    private rwc x;
    private rwc y;
    private rwc z;

    public rga() {
    }

    public final rgb a() {
        int i;
        rnt.M(b() >= 0.0f && b() <= 1.0f, "Confidence must be in range [0, 1].");
        sbp sbpVar = this.l;
        if (sbpVar == null) {
            throw new IllegalStateException();
        }
        int i2 = 0;
        while (i2 < ((sex) sbpVar).c) {
            rgf rgfVar = (rgf) sbpVar.get(i2);
            rgfVar.getClass();
            rnt.M(rgfVar.a.size() > 2, "At least 3 points are required for a bounding polygon.");
            Iterator it = rgfVar.iterator();
            while (true) {
                i = i2 + 1;
                if (it.hasNext()) {
                    ((PointF) it.next()).getClass();
                }
            }
            i2 = i;
        }
        if (c() == rfw.FULL_RAW_TEXT || c() == rfw.TEXT_DETECTION_BOUNDING_BOX) {
            rnt.M(false, "TextImage is required with FULL_RAW_TEXT result.");
        } else {
            rnt.M(true, "TextImage should not be set for non-FULL_RAW_TEXT result.");
        }
        if (c() == rfw.UNSTRUCTURED_TEXT) {
            rnt.M(false, "UnstructuredText is required with UNSTRUCTURED_TEXT result.");
        } else {
            rnt.M(true, "UnstructuredText should not be set for non-UNSTRUCTURED_TEXT result.");
        }
        if (this.a) {
            rfx rfxVar = new rfx(null);
            int iOrdinal = c().ordinal();
            if (iOrdinal != 5) {
                switch (iOrdinal) {
                    case 8:
                        rfxVar.b().h(d().a);
                        break;
                    case 9:
                        rfxVar.c().h(d().a);
                        break;
                    case 10:
                        rfxVar.e(d().a);
                        break;
                }
            } else {
                rfxVar.d(d().a);
            }
            g(rfxVar.a());
        }
        if (this.h != 3 || this.b == null || this.j == null || this.i == 0 || this.l == null) {
            throw new IllegalStateException();
        }
        return new rfz(this.b, this.j, this.i, this.k, this.l, this.m, this.n, this.o, this.c, this.p, this.q, this.r, this.d, this.s, this.t, this.u, this.v, this.w, this.x, this.e, this.f, this.g, this.y, this.z, this.A, this.B);
    }

    protected final float b() {
        if ((this.h & 1) != 0) {
            return this.k;
        }
        throw new IllegalStateException();
    }

    protected final rfw c() {
        rfw rfwVar = this.j;
        if (rfwVar != null) {
            return rfwVar;
        }
        throw new IllegalStateException();
    }

    public final rgc d() {
        rgc rgcVar = this.b;
        if (rgcVar != null) {
            return rgcVar;
        }
        throw new IllegalStateException();
    }

    public final void e(sbp sbpVar) {
        sbpVar.getClass();
        this.l = sbpVar;
    }

    public final void f() {
        this.k = 1.0f;
        this.h = (byte) (this.h | 1);
    }

    public final void g(rfy rfyVar) {
        this.r = rwc.j(rfyVar);
    }

    public final void h(rfw rfwVar) {
        rfwVar.getClass();
        this.j = rfwVar;
    }

    public rga(byte[] bArr) {
        rvk rvkVar = rvk.a;
        this.m = rvkVar;
        this.n = rvkVar;
        this.o = rvkVar;
        this.c = rvkVar;
        this.p = rvkVar;
        this.q = rvkVar;
        this.r = rvkVar;
        this.d = rvkVar;
        this.s = rvkVar;
        this.t = rvkVar;
        this.u = rvkVar;
        this.v = rvkVar;
        this.w = rvkVar;
        this.x = rvkVar;
        this.e = rvkVar;
        this.f = rvkVar;
        this.g = rvkVar;
        this.y = rvkVar;
        this.z = rvkVar;
        this.A = rvkVar;
        this.B = rvkVar;
    }
}
