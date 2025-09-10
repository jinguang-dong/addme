package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.LongSparseArray;
import android.view.DragEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class kk {
    public kk() {
    }

    public static void b(View view, float f) {
        try {
            view.setFrameContentVelocity(f);
        } catch (LinkageError unused) {
        }
    }

    static void d(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof mm) {
                editorInfo.hintText = ((mm) parent).a();
                return;
            }
        }
    }

    static /* synthetic */ View e(kq kqVar, kf kfVar) {
        int iAn = kqVar.an();
        View view = null;
        if (iAn == 0) {
            return null;
        }
        int iJ = kfVar.j() + (kfVar.k() / 2);
        int i = 0;
        int i2 = Integer.MAX_VALUE;
        while (i < iAn) {
            View viewAz = kqVar.az(i);
            int iAbs = Math.abs((kfVar.d(viewAz) + (kfVar.b(viewAz) / 2)) - iJ);
            int i3 = iAbs < i2 ? iAbs : i2;
            if (iAbs < i2) {
                view = viewAz;
            }
            i++;
            i2 = i3;
        }
        return view;
    }

    public static /* synthetic */ String g(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "CAMERA2_EXCEPTION" : "CAMERA2_ERROR" : "CAMERA2_DISCONNECTED" : "CAMERA2_CLOSED" : "APP_DISCONNECTED" : "APP_CLOSED";
    }

    public static boolean h(int i) {
        return a.p(i, 1) || a.p(i, 2);
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    public static java.lang.Object i(defpackage.bkb r10, int r11, defpackage.uiq r12) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kk.i(bkb, int, uiq):java.lang.Object");
    }

    public static bik j(bik bikVar, float f) {
        return f == 1.0f ? bikVar : bko.f(bikVar, f, 0.0f, null, true, 520187);
    }

    public static void k(bxd bxdVar, uiq uiqVar) {
        if (uiqVar.a(bxdVar) != bxc.a) {
            return;
        }
        bad.B(bxdVar, uiqVar);
    }

    public static boolean l(bjg bjgVar, long j) {
        if (!bjgVar.m.w) {
            return false;
        }
        bwi bwiVarN = bko.B(bjgVar).n();
        if (!bwiVarN.dm()) {
            return false;
        }
        long jS = byi.s(bwiVarN);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jS >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jS & 4294967295L));
        long j2 = bjgVar.c;
        float f = ((int) (j2 >> 32)) + fIntBitsToFloat;
        float f2 = ((int) (j2 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (fIntBitsToFloat <= fIntBitsToFloat3 && fIntBitsToFloat3 <= f) {
            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
            if (fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f2) {
                return true;
            }
        }
        return false;
    }

    public static void m(bjc bjcVar, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        ebn ebnVar;
        Object obj;
        cbc cbcVar;
        uiq uiqVar;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long jKeyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse viewTranslationResponse = (ViewTranslationResponse) longSparseArray.get(jKeyAt);
            if (viewTranslationResponse != null && (value = viewTranslationResponse.getValue("android:text")) != null && (text = value.getText()) != null && (ebnVar = (ebn) bjcVar.a().a((int) jKeyAt)) != null && (obj = ebnVar.a) != null && (cbcVar = (cbc) clc.ad(((cbr) obj).c, cbm.k)) != null && (uiqVar = (uiq) cbcVar.b) != null) {
            }
        }
    }

    public static long o(ejs ejsVar) {
        DragEvent dragEvent = (DragEvent) ejsVar.a;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L);
    }

    public void a(RecyclerView recyclerView, int i, int i2) {
    }

    public void c(RecyclerView recyclerView, int i) {
    }

    public kk(byte[] bArr) {
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0342 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014a A[PHI: r6 r20 r21 r22 r23 r24 r25 r26 r27
      0x014a: PHI (r6v16 biq) = (r6v15 biq), (r6v18 biq) binds: [B:8:0x0047, B:58:0x0147] A[DONT_GENERATE, DONT_INLINE]
      0x014a: PHI (r20v2 ccg) = (r20v1 ccg), (r20v4 ccg) binds: [B:8:0x0047, B:58:0x0147] A[DONT_GENERATE, DONT_INLINE]
      0x014a: PHI (r21v4 boolean) = (r21v3 boolean), (r21v6 boolean) binds: [B:8:0x0047, B:58:0x0147] A[DONT_GENERATE, DONT_INLINE]
      0x014a: PHI (r22v4 bix) = (r22v3 bix), (r22v6 bix) binds: [B:8:0x0047, B:58:0x0147] A[DONT_GENERATE, DONT_INLINE]
      0x014a: PHI (r23v4 java.lang.Boolean) = (r23v3 java.lang.Boolean), (r23v6 java.lang.Boolean) binds: [B:8:0x0047, B:58:0x0147] A[DONT_GENERATE, DONT_INLINE]
      0x014a: PHI (r24v3 cbk) = (r24v2 cbk), (r24v5 cbk) binds: [B:8:0x0047, B:58:0x0147] A[DONT_GENERATE, DONT_INLINE]
      0x014a: PHI (r25v4 boolean) = (r25v3 boolean), (r25v6 boolean) binds: [B:8:0x0047, B:58:0x0147] A[DONT_GENERATE, DONT_INLINE]
      0x014a: PHI (r26v2 ccm) = (r26v1 ccm), (r26v4 ccm) binds: [B:8:0x0047, B:58:0x0147] A[DONT_GENERATE, DONT_INLINE]
      0x014a: PHI (r27v4 java.lang.Integer) = (r27v3 java.lang.Integer), (r27v6 java.lang.Integer) binds: [B:8:0x0047, B:58:0x0147] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void n(android.view.ViewStructure r36, defpackage.bvm r37, android.view.autofill.AutofillId r38, java.lang.String r39, defpackage.cce r40) {
        /*
            Method dump skipped, instructions count: 882
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kk.n(android.view.ViewStructure, bvm, android.view.autofill.AutofillId, java.lang.String, cce):void");
    }

    public kk(vp vpVar, und undVar) {
        vpVar.getClass();
        undVar.getClass();
        new ArrayList();
        new LinkedHashSet();
        new LinkedHashMap();
    }
}
