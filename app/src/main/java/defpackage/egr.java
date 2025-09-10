package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class egr implements egq, egy, ego {
    private final String b;
    private final efs c;
    private final boolean d;
    private final boolean e;
    private final ehd f;
    private final ehd g;
    private final ehd h;
    private final ehd i;
    private final ehd j;
    private final ehd k;
    private final ehd l;
    private boolean m;
    private final int n;
    private final Path a = new Path();
    private final cxb o = new cxb((short[]) null);

    public egr(efs efsVar, ejh ejhVar, eiw eiwVar) {
        this.c = efsVar;
        this.b = eiwVar.a;
        int i = eiwVar.k;
        this.n = i;
        this.d = eiwVar.i;
        this.e = eiwVar.j;
        ehd ehdVarA = eiwVar.b.a();
        this.f = ehdVarA;
        ehd ehdVarA2 = eiwVar.c.a();
        this.g = ehdVarA2;
        ehd ehdVarA3 = eiwVar.d.a();
        this.h = ehdVarA3;
        ehd ehdVarA4 = eiwVar.f.a();
        this.j = ehdVarA4;
        ehd ehdVarA5 = eiwVar.h.a();
        this.l = ehdVarA5;
        if (i == 1) {
            this.i = eiwVar.e.a();
            this.k = eiwVar.g.a();
        } else {
            this.i = null;
            this.k = null;
        }
        ejhVar.i(ehdVarA);
        ejhVar.i(ehdVarA2);
        ejhVar.i(ehdVarA3);
        ejhVar.i(ehdVarA4);
        ejhVar.i(ehdVarA5);
        if (i == 1) {
            ejhVar.i(this.i);
            ejhVar.i(this.k);
        }
        ehdVarA.h(this);
        ehdVarA2.h(this);
        ehdVarA3.h(this);
        ehdVarA4.h(this);
        ehdVarA5.h(this);
        if (i == 1) {
            this.i.h(this);
            this.k.h(this);
        }
    }

    @Override // defpackage.eib
    public final void a(Object obj, elq elqVar) {
        ehd ehdVar;
        ehd ehdVar2;
        ehd ehdVar3;
        if (obj == efx.w) {
            ehdVar = this.f;
        } else if (obj == efx.x) {
            ehdVar = this.h;
        } else if (obj == efx.n) {
            ehdVar = this.g;
        } else {
            if (obj == efx.y && (ehdVar3 = this.i) != null) {
                ehdVar3.d = elqVar;
                return;
            }
            if (obj == efx.z) {
                ehdVar = this.j;
            } else if (obj == efx.A && (ehdVar2 = this.k) != null) {
                ehdVar2.d = elqVar;
                return;
            } else if (obj != efx.B) {
                return;
            } else {
                ehdVar = this.l;
            }
        }
        ehdVar.d = elqVar;
    }

    @Override // defpackage.egy
    public final void d() {
        this.m = false;
        this.c.invalidateSelf();
    }

    @Override // defpackage.eib
    public final void e(eia eiaVar, int i, List list, eia eiaVar2) {
        eli.d(eiaVar, i, list, eiaVar2, this);
    }

    @Override // defpackage.egg
    public final void f(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            egg eggVar = (egg) list.get(i);
            if (eggVar instanceof egx) {
                egx egxVar = (egx) eggVar;
                if (egxVar.e == 1) {
                    this.o.i(egxVar);
                    egxVar.a(this);
                }
            }
        }
    }

    @Override // defpackage.egg
    public final String g() {
        return this.b;
    }

    @Override // defpackage.egq
    public final Path i() {
        float f;
        float f2;
        float fSin;
        float f3;
        double d;
        float f4;
        float f5;
        float f6;
        float f7;
        boolean z;
        int i;
        float f8;
        float f9;
        if (this.m) {
            return this.a;
        }
        Path path = this.a;
        path.reset();
        if (this.d) {
            this.m = true;
            return path;
        }
        int i2 = this.n;
        if (i2 == 0) {
            throw null;
        }
        if (i2 != 1) {
            int iFloor = (int) Math.floor(((Float) this.f.e()).floatValue());
            double dFloatValue = ((Float) this.h.e()).floatValue();
            ehd ehdVar = this.l;
            double radians = Math.toRadians(dFloatValue - 90.0d);
            float fFloatValue = ((Float) ehdVar.e()).floatValue() / 100.0f;
            float fFloatValue2 = ((Float) this.j.e()).floatValue();
            double d2 = fFloatValue2;
            float fCos = (float) (d2 * Math.cos(radians));
            float fSin2 = (float) (d2 * Math.sin(radians));
            path.moveTo(fCos, fSin2);
            double d3 = iFloor;
            double d4 = (float) (6.283185307179586d / d3);
            double dCeil = Math.ceil(d3);
            double d5 = radians + d4;
            int i3 = 0;
            while (i3 < dCeil) {
                float f10 = fFloatValue2;
                float fCos2 = (float) (Math.cos(d5) * d2);
                float fSin3 = (float) (d2 * Math.sin(d5));
                if (fFloatValue != 0.0f) {
                    Path path2 = path;
                    i = i3;
                    double dAtan2 = (float) (Math.atan2(fSin2, fCos) - 1.5707963267948966d);
                    float fCos3 = (float) Math.cos(dAtan2);
                    float fSin4 = (float) Math.sin(dAtan2);
                    double dAtan22 = (float) (Math.atan2(fSin3, fCos2) - 1.5707963267948966d);
                    float f11 = f10 * fFloatValue * 0.25f;
                    float f12 = fCos - (fCos3 * f11);
                    float f13 = fSin2 - (f11 * fSin4);
                    float fCos4 = (((float) Math.cos(dAtan22)) * f11) + fCos2;
                    float fSin5 = fSin3 + (f11 * ((float) Math.sin(dAtan22)));
                    f8 = fCos2;
                    f9 = fSin3;
                    path = path2;
                    path.cubicTo(f12, f13, fCos4, fSin5, f8, f9);
                } else {
                    i = i3;
                    f8 = fCos2;
                    f9 = fSin3;
                    path.lineTo(f8, f9);
                }
                d5 += d4;
                i3 = i + 1;
                fCos = f8;
                fSin2 = f9;
                fFloatValue2 = f10;
            }
            PointF pointF = (PointF) this.g.e();
            path.offset(pointF.x, pointF.y);
            path.close();
        } else {
            float fFloatValue3 = ((Float) this.f.e()).floatValue();
            double dFloatValue2 = ((Float) this.h.e()).floatValue();
            double d6 = fFloatValue3;
            boolean z2 = this.e;
            float f14 = (float) (6.283185307179586d / d6);
            double radians2 = Math.toRadians(dFloatValue2 - 90.0d);
            if (z2) {
                f14 = -f14;
            }
            float f15 = f14;
            float f16 = fFloatValue3 - ((int) fFloatValue3);
            float f17 = f15 / 2.0f;
            if (f16 != 0.0f) {
                radians2 += (1.0f - f16) * f17;
            }
            float fFloatValue4 = ((Float) this.j.e()).floatValue();
            float fFloatValue5 = ((Float) this.i.e()).floatValue();
            ehd ehdVar2 = this.k;
            float fFloatValue6 = ehdVar2 != null ? ((Float) ehdVar2.e()).floatValue() / 100.0f : 0.0f;
            float fFloatValue7 = ((Float) this.l.e()).floatValue() / 100.0f;
            if (f16 != 0.0f) {
                float f18 = fFloatValue5 + ((fFloatValue4 - fFloatValue5) * f16);
                f = f15;
                double d7 = f18;
                f2 = 2.0f;
                float fCos5 = (float) (d7 * Math.cos(radians2));
                fSin = (float) (d7 * Math.sin(radians2));
                path.moveTo(fCos5, fSin);
                d = radians2 + ((f15 * f16) / 2.0f);
                f4 = fCos5;
                f3 = f17;
                f5 = f18;
            } else {
                double d8 = radians2;
                f = f15;
                f2 = 2.0f;
                double d9 = fFloatValue4;
                float fCos6 = (float) (Math.cos(d8) * d9);
                fSin = (float) (d9 * Math.sin(d8));
                path.moveTo(fCos6, fSin);
                f3 = f17;
                d = d8 + f3;
                f4 = fCos6;
                f5 = 0.0f;
            }
            double dCeil2 = Math.ceil(d6);
            double d10 = dCeil2 + dCeil2;
            double d11 = d;
            boolean z3 = false;
            int i4 = 0;
            while (true) {
                double d12 = i4;
                if (d12 >= d10) {
                    break;
                }
                float f19 = fFloatValue4;
                float f20 = true != z3 ? fFloatValue5 : f19;
                if (f5 == 0.0f || d12 != d10 - 2.0d) {
                    f6 = f3;
                } else {
                    f6 = f3;
                    f3 = (f * f16) / f2;
                }
                if (f5 == 0.0f || d12 != d10 - 1.0d) {
                    f7 = f20;
                } else {
                    f7 = f20;
                    f20 = f5;
                }
                double d13 = f20;
                float f21 = fFloatValue7;
                double d14 = d10;
                float fCos7 = (float) (d13 * Math.cos(d11));
                float fSin6 = (float) (d13 * Math.sin(d11));
                if (fFloatValue6 == 0.0f && f21 == 0.0f) {
                    path.lineTo(fCos7, fSin6);
                    z = z3;
                    fSin = fSin6;
                } else {
                    Path path3 = path;
                    double dAtan23 = (float) (Math.atan2(fSin, f4) - 1.5707963267948966d);
                    float fCos8 = (float) Math.cos(dAtan23);
                    float fSin7 = (float) Math.sin(dAtan23);
                    double dAtan24 = (float) (Math.atan2(fSin6, fCos7) - 1.5707963267948966d);
                    float fCos9 = (float) Math.cos(dAtan24);
                    float fSin8 = (float) Math.sin(dAtan24);
                    float f22 = true != z3 ? f21 : fFloatValue6;
                    float f23 = true != z3 ? fFloatValue6 : f21;
                    float f24 = (true != z3 ? f19 : fFloatValue5) * f22 * 0.47829f;
                    float f25 = fCos8 * f24;
                    float f26 = f24 * fSin7;
                    float f27 = f7 * f23 * 0.47829f;
                    float f28 = fCos9 * f27;
                    float f29 = f27 * fSin8;
                    if (f16 != 0.0f) {
                        if (i4 == 0) {
                            f25 *= f16;
                            f26 *= f16;
                        } else if (d12 == d14 - 1.0d) {
                            f28 *= f16;
                            f29 *= f16;
                        }
                    }
                    z = z3;
                    path = path3;
                    fSin = fSin6;
                    path.cubicTo(f4 - f25, fSin - f26, f28 + fCos7, f29 + fSin6, fCos7, fSin);
                }
                d11 += f3;
                z3 = !z;
                i4++;
                f4 = fCos7;
                fFloatValue4 = f19;
                f3 = f6;
                fFloatValue7 = f21;
                d10 = d14;
            }
            PointF pointF2 = (PointF) this.g.e();
            path.offset(pointF2.x, pointF2.y);
            path.close();
        }
        path.close();
        this.o.j(path);
        this.m = true;
        return path;
    }
}
