package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsetsAnimation;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brr extends coy implements Runnable, View.OnAttachStateChangeListener, cny {
    private boolean b;
    private int c;
    private cpp d;
    private final zu e;
    private final bgz f;
    private final bbd g;
    private final zo h;

    public brr() {
        super(1);
        zu zuVar = new zu(9);
        brl brlVar = brs.a;
        zuVar.j(brs.c, new btx());
        zuVar.j(brs.a, new btx());
        zuVar.j(brs.d, new btx());
        zuVar.j(brs.e, new btx());
        zuVar.j(brs.f, new btx());
        zuVar.j(brs.g, new btx());
        zuVar.j(brs.h, new btx());
        zuVar.j(brs.i, new btx());
        zuVar.j(brs.b, new btx());
        this.e = zuVar;
        this.g = new azw(0);
        this.h = new zo(4);
        this.f = new bgz();
    }

    private final void f(cpp cppVar) {
        long j;
        long j2;
        char c;
        char c2;
        char c3;
        char c4;
        long j3;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        int i;
        char c5;
        long j4;
        bbd bbdVar = this.g;
        bbdVar.h(bbdVar.e() + 1);
        yq yqVar = brt.b;
        int[] iArr3 = yqVar.b;
        Object[] objArr = yqVar.c;
        long[] jArr3 = yqVar.a;
        int length = jArr3.length - 2;
        long j5 = -9187201950435737472L;
        int i2 = 8;
        if (length >= 0) {
            int i3 = 0;
            char c6 = 7;
            j2 = 255;
            c = 16;
            while (true) {
                long j6 = jArr3[i3];
                c2 = ' ';
                c3 = '0';
                if ((((~j6) << c6) & j6 & j5) != j5) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j6 & 255) < 128) {
                            int i6 = (i3 << 3) + i5;
                            c5 = c6;
                            int i7 = iArr3[i6];
                            j4 = j5;
                            btg btgVar = (btg) objArr[i6];
                            i = i2;
                            long j7 = r9.b << 48;
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            long j8 = r9.c << 32;
                            long j9 = r9.d << 16;
                            int i8 = cppVar.f(i7).e;
                            Object objA = this.e.a(btgVar);
                            objA.getClass();
                            ((btx) objA).c = j9 | j7 | j8 | i8;
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            i = i2;
                            c5 = c6;
                            j4 = j5;
                        }
                        j6 >>= i;
                        i5++;
                        c6 = c5;
                        j5 = j4;
                        i2 = i;
                        iArr3 = iArr2;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    c4 = c6;
                    j = j5;
                    if (i4 != i2) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    iArr = iArr3;
                    c4 = c6;
                    j = j5;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                c6 = c4;
                j5 = j;
                iArr3 = iArr;
                jArr3 = jArr;
                i2 = 8;
            }
        } else {
            j = -9187201950435737472L;
            j2 = 255;
            c = 16;
            c2 = ' ';
            c3 = '0';
            c4 = 7;
        }
        yq yqVar2 = brt.c;
        int[] iArr4 = yqVar2.b;
        Object[] objArr2 = yqVar2.c;
        long[] jArr4 = yqVar2.a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i9 = 0;
            while (true) {
                long j10 = jArr4[i9];
                if ((((~j10) << c4) & j10 & j) != j) {
                    int i10 = 8 - ((~(i9 - length2)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((j10 & j2) < 128) {
                            int i12 = (i9 << 3) + i11;
                            int i13 = iArr4[i12];
                            Object objA2 = this.e.a((brq) objArr2[i12]);
                            objA2.getClass();
                            btx btxVar = (btx) objA2;
                            if (i13 != 8) {
                                cppVar.b.c(i13);
                            } else {
                                i13 = 8;
                            }
                            btxVar.a.b(Boolean.valueOf(cppVar.b.m(i13)));
                        }
                        j10 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                }
                if (i9 == length2) {
                    break;
                } else {
                    i9++;
                }
            }
        }
        cnq cnqVarI = cppVar.i();
        if (cnqVarI == null) {
            j3 = 0;
        } else {
            cmh cmhVarC = cmh.c(cnqVarI.a.getWaterfallInsets());
            j3 = (cmhVarC.b << c3) | (cmhVarC.c << c2) | (cmhVarC.d << c) | cmhVarC.e;
        }
        zu zuVar = this.e;
        brl brlVar = brs.a;
        Object objA3 = zuVar.a(brs.b);
        objA3.getClass();
        ((btx) objA3).c = j3;
        long jB = cnqVarI != null ? (cnqVarI.b() << c3) | (cnqVarI.d() << c2) | (cnqVarI.c() << c) | cnqVarI.a() : 0L;
        Object objA4 = zuVar.a(brs.a);
        objA4.getClass();
        ((btx) objA4).c = jB;
        if (cnqVarI == null) {
            zo zoVar = this.h;
            if (zoVar.b > 0) {
                zoVar.j();
                this.f.clear();
            }
        } else {
            List<Rect> boundingRects = cnqVarI.a.getBoundingRects();
            int size = boundingRects.size();
            zo zoVar2 = this.h;
            if (size < zoVar2.b) {
                zoVar2.k(boundingRects.size(), zoVar2.b);
                bgz bgzVar = this.f;
                bgzVar.h(boundingRects.size(), bgzVar.a());
            } else {
                int size2 = boundingRects.size() - zoVar2.b;
                for (int i14 = 0; i14 < size2; i14++) {
                    zoVar2.o(new azz(boundingRects.get(zoVar2.b), bap.c));
                    this.f.add(new bth("display cutout rect " + zoVar2.b, 0));
                }
            }
            int size3 = boundingRects.size();
            for (int i15 = 0; i15 < size3; i15++) {
                ((azr) zoVar2.c(i15)).b(boundingRects.get(i15));
            }
        }
        bay.F();
    }

    private static final void g(btx btxVar, sgh sghVar) {
        btxVar.f(((WindowInsetsAnimation) ((ocq) sghVar.a).a).getInterpolator());
        btxVar.d(((WindowInsetsAnimation) ((ocq) sghVar.a).a).getFraction());
        btxVar.a(((WindowInsetsAnimation) ((ocq) sghVar.a).a).getAlpha());
        btxVar.e(sghVar.g());
        btxVar.c(sghVar.i());
    }

    @Override // defpackage.cny
    public final cpp a(View view, cpp cppVar) {
        if (this.b) {
            this.d = cppVar;
            return cppVar;
        }
        if (this.c == 0) {
            f(cppVar);
        }
        return cppVar;
    }

    @Override // defpackage.coy
    public final void b() {
        this.b = true;
    }

    @Override // defpackage.coy
    public final void c(cpp cppVar, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sgh sghVar = (sgh) list.get(i);
            int iH = sghVar.h();
            brq brqVar = (brq) brt.c.a(iH);
            if (brqVar != null) {
                Object objA = this.e.a(brqVar);
                objA.getClass();
                btx btxVar = (btx) objA;
                if (((Boolean) btxVar.b.a()).booleanValue()) {
                    g(btxVar, sghVar);
                    cmh cmhVarF = cppVar.f(iH);
                    int i2 = cmhVarF.b;
                    long j = cmhVarF.c;
                    btxVar.c = cmhVarF.e | (cmhVarF.d << 16) | (i2 << 48) | (j << 32);
                }
            }
        }
        f(cppVar);
    }

    @Override // defpackage.coy
    public final void d(sgh sghVar) {
        this.b = false;
        int iH = sghVar.h();
        this.c = (~iH) & this.c;
        this.d = null;
        brq brqVar = (brq) brt.c.a(iH);
        if (brqVar != null) {
            Object objA = this.e.a(brqVar);
            objA.getClass();
            btx btxVar = (btx) objA;
            btxVar.f(null);
            btxVar.d(0.0f);
            btxVar.e(0.0f);
            btxVar.a(1.0f);
            btxVar.c(0L);
            btxVar.d(0.0f);
            btxVar.e(0.0f);
            btxVar.f(null);
            btxVar.b(false);
            bbd bbdVar = this.g;
            bbdVar.h(bbdVar.e() + 1);
            bay.F();
        }
    }

    @Override // defpackage.coy
    public final void e(sgh sghVar) {
        cpp cppVar = this.d;
        this.b = false;
        this.d = null;
        if (sghVar.i() <= 0 || cppVar == null) {
            return;
        }
        int iH = sghVar.h();
        this.c |= iH;
        brq brqVar = (brq) brt.c.a(iH);
        if (brqVar != null) {
            Object objA = this.e.a(brqVar);
            objA.getClass();
            btx btxVar = (btx) objA;
            cmh cmhVarF = cppVar.f(iH);
            int i = cmhVarF.b;
            int i2 = cmhVarF.c;
            int i3 = cmhVarF.d;
            long j = i2;
            if (a.q(cmhVarF.e | (i3 << 16) | (i << 48) | (j << 32), btxVar.c)) {
                return;
            }
            btxVar.b(true);
            g(btxVar, sghVar);
            bbd bbdVar = this.g;
            bbdVar.h(bbdVar.e() + 1);
            bay.F();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int[] iArr = con.a;
        cog.i(view, this);
        ocq.at(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int[] iArr = con.a;
        cog.i(view, null);
        ocq.at(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b) {
            this.c = 0;
            this.b = false;
            cpp cppVar = this.d;
            if (cppVar != null) {
                f(cppVar);
                this.d = null;
            }
        }
    }
}
