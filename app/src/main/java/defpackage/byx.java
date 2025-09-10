package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.os.Looper;
import android.text.Layout;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.bumptech.glide.qd.MyBPCgKwEjJI;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byx {
    public static final void a(View view, float f) {
        view.setRequestedFrameRate(f);
    }

    public static final boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static final float c(int i, ayc aycVar) {
        return ((Resources) aycVar.e(AndroidCompositionLocals_androidKt.c)).getDimension(i) / ((chq) aycVar.e(bze.c)).a();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:58:0x01aa
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016c  */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.bne d(int r59, defpackage.ayc r60, int r61) {
        /*
            Method dump skipped, instructions count: 1388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byx.d(int, ayc, int):bne");
    }

    public static final long e(int i, ayc aycVar) {
        Context context = (Context) aycVar.e(AndroidCompositionLocals_androidKt.b);
        Resources resources = (Resources) aycVar.e(AndroidCompositionLocals_androidKt.c);
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = cme.a;
        return bko.i(resources.getColor(i, theme));
    }

    public static final cfd f(cfc... cfcVarArr) {
        return new cfg(rnt.ae(cfcVarArr));
    }

    public static /* synthetic */ cfc g(String str, cfp cfpVar, cfo cfoVar, int i) {
        if ((i & 2) != 0) {
            cfpVar = cfp.e;
        }
        if ((i & 8) != 0) {
            cfoVar = new cfo(new cfl[0]);
        }
        return new cfb(str, cfpVar, cfoVar);
    }

    public static final float h(Layout layout, int i, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        if (!cdz.c(layout, i) || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float primaryHorizontal = (layout.getPrimaryHorizontal(layout.getLineStart(i) + layout.getEllipsisStart(i)) - lineLeft) + paint.measureText("…");
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if (paragraphAlignment != null && cee.a[paragraphAlignment.ordinal()] == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - primaryHorizontal) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - primaryHorizontal;
        }
        return fAbs + width;
    }

    public static final float i(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        if (!cdz.c(layout, i) || layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float lineRight = (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getLineStart(i) + layout.getEllipsisStart(i))) + paint.measureText("…");
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if (paragraphAlignment != null && cee.a[paragraphAlignment.ordinal()] == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - lineRight) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - lineRight;
        }
        return width - width2;
    }

    public static final cdo j(cdo cdoVar, cib cibVar) {
        long j;
        int i;
        int i2;
        cdh cdhVar = cdoVar.b;
        chg chgVar = cdhVar.a;
        long j2 = cdi.a;
        chg chgVarD = chgVar.d(new bfw(4));
        long j3 = cdhVar.b;
        if (cid.a(j3) == 0) {
            j3 = cdi.a;
        }
        cfp cfpVar = cdhVar.c;
        if (cfpVar == null) {
            cfpVar = cfp.e;
        }
        cfp cfpVar2 = cfpVar;
        cfj cfjVar = new cfj();
        cfk cfkVar = new cfk();
        cfd cfdVar = cdhVar.f;
        if (cfdVar == null) {
            cfdVar = cfd.e;
        }
        cfd cfdVar2 = cfdVar;
        String str = cdhVar.g;
        long j4 = cdhVar.h;
        if (cid.a(j4) == 0) {
            j4 = cdi.b;
        }
        long j5 = j4;
        cgv cgvVar = new cgv();
        chh chhVar = cdhVar.j;
        if (chhVar == null) {
            chhVar = chh.a;
        }
        chh chhVar2 = chhVar;
        cgk cgkVarX = cdhVar.k;
        if (cgkVarX == null) {
            int i3 = cgk.b;
            cgkVarX = clc.X();
        }
        cgk cgkVar = cgkVarX;
        long j6 = cdhVar.l;
        if (j6 == 16) {
            j6 = cdi.c;
        }
        long j7 = j6;
        chd chdVar = cdhVar.m;
        if (chdVar == null) {
            chdVar = chd.a;
        }
        chd chdVar2 = chdVar;
        blo bloVar = cdhVar.n;
        if (bloVar == null) {
            bloVar = blo.a;
        }
        blo bloVar2 = bloVar;
        byi byiVar = cdhVar.p;
        if (byiVar == null) {
            byiVar = bmx.a;
        }
        byi byiVar2 = byiVar;
        if (str == null) {
            str = "";
        }
        cdh cdhVar2 = new cdh(chgVarD, j3, cfpVar2, cfjVar, cfkVar, cfdVar2, str, j5, cgvVar, chhVar2, cgkVar, j7, chdVar2, bloVar2, byiVar2);
        cdb cdbVar = cdoVar.c;
        int i4 = cdbVar.a;
        long j8 = cdc.a;
        int i5 = cdbVar.b;
        if (a.p(i5, 3)) {
            int iOrdinal = cibVar.ordinal();
            if (iOrdinal == 0) {
                i5 = 4;
            } else {
                if (iOrdinal != 1) {
                    throw new uet();
                }
                i5 = 5;
            }
        } else if (a.p(i5, Integer.MIN_VALUE)) {
            int iOrdinal2 = cibVar.ordinal();
            if (iOrdinal2 == 0) {
                i5 = 1;
            } else {
                if (iOrdinal2 != 1) {
                    throw new uet();
                }
                i5 = 2;
            }
        }
        long j9 = cdbVar.c;
        if (cid.a(j9) == 0) {
            j9 = cdc.a;
        }
        chi chiVar = cdbVar.d;
        if (chiVar == null) {
            chiVar = chi.a;
        }
        long j10 = j9;
        cde cdeVar = cdbVar.e;
        chb chbVar = cdbVar.f;
        int i6 = cdbVar.g;
        if (true == a.p(i6, 0)) {
            i6 = 66305;
        }
        int i7 = cdbVar.h;
        boolean zP = a.p(i7, Integer.MIN_VALUE);
        chj chjVar = cdbVar.i;
        if (chjVar == null) {
            chjVar = chj.a;
        }
        if (true == zP) {
            i7 = 1;
        }
        if (true == a.p(i4, Integer.MIN_VALUE)) {
            j = j10;
            i = i6;
            i2 = 5;
        } else {
            j = j10;
            i = i6;
            i2 = i4;
        }
        return new cdo(cdhVar2, new cdb(i2, i5, j, chiVar, cdeVar, chbVar, i, i7, chjVar), cdoVar.d);
    }

    public static final int l(float f) {
        return (int) Math.ceil(f);
    }

    public static final int m(float[] fArr) {
        int length = fArr.length;
        int i = 0;
        int i2 = (fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0;
        if (fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) {
            i = 1;
        }
        return (i2 + i2) | i;
    }

    public static final boolean n(long j) {
        return !a.q(j, 9223372034707292159L);
    }

    public static ocq o(View view) {
        return new ocq(view.getAutofillId());
    }

    public static final long k(int i, int i2) {
        if (i < 0 || i2 < 0) {
            cgh.a(MyBPCgKwEjJI.VPprxbgoGSIc + i + ", end: " + i2 + ']');
        }
        return (i2 & 4294967295L) | (i << 32);
    }
}
