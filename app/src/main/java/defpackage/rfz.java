package defpackage;

import android.graphics.PointF;
import android.graphics.RectF;
import com.google.android.apps.camera.modeldownloader.uD.uCzt;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rfz extends rgb {
    private volatile transient rwc A;
    private final rgc a;
    private final rfw b;
    private final float c;
    private final sbp d;
    private final rwc e;
    private final rwc f;
    private final rwc g;
    private final rwc h;
    private final rwc i;
    private final rwc j;
    private final rwc k;
    private final rwc l;
    private final rwc m;
    private final rwc n;
    private final rwc o;
    private final rwc p;
    private final rwc q;
    private final rwc r;
    private final rwc s;
    private final rwc t;
    private final rwc u;
    private final rwc v;
    private final rwc w;
    private final rwc x;
    private final rwc y;
    private final int z;

    public rfz(rgc rgcVar, rfw rfwVar, int i, float f, sbp sbpVar, rwc rwcVar, rwc rwcVar2, rwc rwcVar3, rwc rwcVar4, rwc rwcVar5, rwc rwcVar6, rwc rwcVar7, rwc rwcVar8, rwc rwcVar9, rwc rwcVar10, rwc rwcVar11, rwc rwcVar12, rwc rwcVar13, rwc rwcVar14, rwc rwcVar15, rwc rwcVar16, rwc rwcVar17, rwc rwcVar18, rwc rwcVar19, rwc rwcVar20, rwc rwcVar21) {
        rgcVar.getClass();
        this.a = rgcVar;
        rfwVar.getClass();
        this.b = rfwVar;
        if (i == 0) {
            throw null;
        }
        this.z = i;
        this.c = f;
        sbpVar.getClass();
        this.d = sbpVar;
        rwcVar.getClass();
        this.e = rwcVar;
        rwcVar2.getClass();
        this.f = rwcVar2;
        rwcVar3.getClass();
        this.g = rwcVar3;
        rwcVar4.getClass();
        this.h = rwcVar4;
        rwcVar5.getClass();
        this.i = rwcVar5;
        rwcVar6.getClass();
        this.j = rwcVar6;
        rwcVar7.getClass();
        this.k = rwcVar7;
        rwcVar8.getClass();
        this.l = rwcVar8;
        rwcVar9.getClass();
        this.m = rwcVar9;
        rwcVar10.getClass();
        this.n = rwcVar10;
        rwcVar11.getClass();
        this.o = rwcVar11;
        rwcVar12.getClass();
        this.p = rwcVar12;
        rwcVar13.getClass();
        this.q = rwcVar13;
        rwcVar14.getClass();
        this.r = rwcVar14;
        rwcVar15.getClass();
        this.s = rwcVar15;
        rwcVar16.getClass();
        this.t = rwcVar16;
        rwcVar17.getClass();
        this.u = rwcVar17;
        rwcVar18.getClass();
        this.v = rwcVar18;
        rwcVar19.getClass();
        this.w = rwcVar19;
        rwcVar20.getClass();
        this.x = rwcVar20;
        rwcVar21.getClass();
        this.y = rwcVar21;
    }

    @Override // defpackage.rgb
    public final rwc A() {
        rwc rwcVarJ;
        int i;
        if (this.A == null) {
            synchronized (this) {
                if (this.A == null) {
                    sbp sbpVar = this.d;
                    if (sbpVar.isEmpty()) {
                        rwcVarJ = rvk.a;
                    } else {
                        int i2 = ((sex) sbpVar).c;
                        float fMax = Float.MIN_VALUE;
                        float fMin = Float.MAX_VALUE;
                        int i3 = 0;
                        float fMax2 = Float.MIN_VALUE;
                        float fMin2 = Float.MAX_VALUE;
                        while (i3 < i2) {
                            Iterator it = ((rgf) sbpVar.get(i3)).iterator();
                            while (true) {
                                i = i3 + 1;
                                if (it.hasNext()) {
                                    PointF pointF = (PointF) it.next();
                                    fMax = Math.max(pointF.x, fMax);
                                    fMin2 = Math.min(pointF.x, fMin2);
                                    fMin = Math.min(pointF.y, fMin);
                                    fMax2 = Math.max(pointF.y, fMax2);
                                }
                            }
                            i3 = i;
                        }
                        rwcVarJ = rwc.j(new RectF(fMin2, fMin, fMax, fMax2));
                    }
                    this.A = rwcVarJ;
                    if (this.A == null) {
                        throw new NullPointerException("getAxisAlignedBoundingBox() cannot return null");
                    }
                }
            }
        }
        return this.A;
    }

    @Override // defpackage.rgb
    public final void B() {
    }

    @Override // defpackage.rgb
    public final float a() {
        return this.c;
    }

    @Override // defpackage.rgb
    public final rfw b() {
        return this.b;
    }

    @Override // defpackage.rgb
    public final rgc c() {
        return this.a;
    }

    @Override // defpackage.rgb
    public final rwc d() {
        return this.h;
    }

    @Override // defpackage.rgb
    public final rwc e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rgb) {
            rgb rgbVar = (rgb) obj;
            if (this.a.equals(rgbVar.c()) && this.b.equals(rgbVar.b()) && this.z == rgbVar.z() && Float.floatToIntBits(this.c) == Float.floatToIntBits(rgbVar.a()) && ujp.aH(this.d, rgbVar.y()) && this.e.equals(rgbVar.u()) && this.f.equals(rgbVar.w()) && this.g.equals(rgbVar.s()) && this.h.equals(rgbVar.d()) && this.i.equals(rgbVar.e()) && this.j.equals(rgbVar.f())) {
                rgbVar.B();
                if (this.k.equals(rgbVar.i()) && this.l.equals(rgbVar.x()) && this.m.equals(rgbVar.o()) && this.n.equals(rgbVar.v()) && this.o.equals(rgbVar.l()) && this.p.equals(rgbVar.j()) && this.q.equals(rgbVar.p()) && this.r.equals(rgbVar.q()) && this.s.equals(rgbVar.t()) && this.t.equals(rgbVar.g()) && this.u.equals(rgbVar.m()) && this.v.equals(rgbVar.k()) && this.w.equals(rgbVar.r()) && this.x.equals(rgbVar.h()) && this.y.equals(rgbVar.n())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.rgb
    public final rwc f() {
        return this.j;
    }

    @Override // defpackage.rgb
    public final rwc g() {
        return this.t;
    }

    @Override // defpackage.rgb
    public final rwc h() {
        return this.x;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        int i = this.z;
        a.aF(i);
        return ((((((((this.u.hashCode() ^ (((((((((((((((((((((((((((((((((((((((((iHashCode * 1000003) ^ i) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.h.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 1237) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.s.hashCode()) * 1000003) ^ this.t.hashCode()) * 1000003)) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    @Override // defpackage.rgb
    public final rwc i() {
        return this.k;
    }

    @Override // defpackage.rgb
    public final rwc j() {
        return this.p;
    }

    @Override // defpackage.rgb
    public final rwc k() {
        return this.v;
    }

    @Override // defpackage.rgb
    public final rwc l() {
        return this.o;
    }

    @Override // defpackage.rgb
    public final rwc m() {
        return this.u;
    }

    @Override // defpackage.rgb
    public final rwc n() {
        return this.y;
    }

    @Override // defpackage.rgb
    public final rwc o() {
        return this.m;
    }

    @Override // defpackage.rgb
    public final rwc p() {
        return this.q;
    }

    @Override // defpackage.rgb
    public final rwc q() {
        return this.r;
    }

    @Override // defpackage.rgb
    public final rwc r() {
        return this.w;
    }

    @Override // defpackage.rgb
    public final rwc s() {
        return this.g;
    }

    @Override // defpackage.rgb
    public final rwc t() {
        return this.s;
    }

    @Override // defpackage.rgb
    public final rwc u() {
        return this.e;
    }

    @Override // defpackage.rgb
    public final rwc v() {
        return this.n;
    }

    @Override // defpackage.rgb
    public final rwc w() {
        return this.f;
    }

    @Override // defpackage.rgb
    public final rwc x() {
        return this.l;
    }

    @Override // defpackage.rgb
    public final sbp y() {
        return this.d;
    }

    @Override // defpackage.rgb
    public final int z() {
        return this.z;
    }

    public final String toString() {
        String string = this.a.toString();
        String string2 = this.b.toString();
        int i = this.z;
        String str = i != 1 ? i != 2 ? i != 3 ? "NONE" : "PHILEASSTORM" : "BARHOPPER" : "PHOTO_OCR";
        float f = this.c;
        sbp sbpVar = this.d;
        rwc rwcVar = this.h;
        rwc rwcVar2 = this.k;
        rwc rwcVar3 = this.l;
        rwc rwcVar4 = this.s;
        rwc rwcVar5 = this.t;
        rwc rwcVar6 = this.u;
        return "{" + string + ", " + string2 + ", " + str + ", " + f + ", " + sbpVar.toString() + ", Optional.absent(), Optional.absent(), Optional.absent(), " + rwcVar.toString() + uCzt.PZvMOMDhQ + rwcVar2.toString() + ", " + rwcVar3.toString() + ", Optional.absent(), Optional.absent(), Optional.absent(), Optional.absent(), Optional.absent(), Optional.absent(), " + rwcVar4.toString() + ", " + rwcVar5.toString() + ", " + rwcVar6.toString() + ", Optional.absent(), Optional.absent(), Optional.absent(), Optional.absent()}";
    }
}
