package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewParent;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.modeldownloader.uD.uCzt;
import com.google.googlex.gcam.dirtylens.PrCd.TOnSyMaYeslEl;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class coi {
    public static void A(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }

    public static cxb B(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            return new cxb();
        }
        ClassLoader classLoader = cxb.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        ugq ugqVar = new ugq(bundle.size());
        for (String str : bundle.keySet()) {
            str.getClass();
            ugqVar.put(str, bundle.get(str));
        }
        return new cxb(ugqVar.e());
    }

    public static boolean C(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }

    public static boolean D(cnr cnrVar, KeyEvent keyEvent) {
        if (cnrVar == null) {
            return false;
        }
        return cnrVar.g(keyEvent);
    }

    static Object E(ExecutorService executorService, Callable callable, int i) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }

    public static cnc[] F(List list) {
        return (cnc[]) list.get(0);
    }

    public static Typeface G(Context context, List list, int i, boolean z, int i2, Handler handler, coi coiVar) {
        Object obj = null;
        ebn ebnVar = new ebn(coiVar, new psi(handler, 1, null), (byte[]) null);
        if (!z) {
            String strA = cnb.a(list, i);
            Typeface typeface = (Typeface) cnb.a.a(strA);
            if (typeface != null) {
                ebnVar.x(new qev(typeface));
                obj = typeface;
            } else {
                cna cnaVar = new cna(ebnVar, 1);
                synchronized (cnb.c) {
                    aaa aaaVar = cnb.d;
                    ArrayList arrayList = (ArrayList) aaaVar.get(strA);
                    if (arrayList != null) {
                        arrayList.add(cnaVar);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(cnaVar);
                        aaaVar.put(strA, arrayList2);
                        cmz cmzVar = new cmz(strA, context, list, i);
                        cnb.b.execute(new cne(Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler(), cmzVar, new cna(strA, 0)));
                    }
                }
            }
        } else {
            if (list.size() > 1) {
                throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
            }
            cmx cmxVar = (cmx) list.get(0);
            zd zdVar = cnb.a;
            String strA2 = cnb.a(ebn.j(new Object[]{cmxVar}), i);
            Typeface typeface2 = (Typeface) cnb.a.a(strA2);
            if (typeface2 != null) {
                ebnVar.x(new qev(typeface2));
                obj = typeface2;
            } else if (i2 == -1) {
                qev qevVarB = cnb.b(strA2, context, ebn.j(new Object[]{cmxVar}), i);
                ebnVar.x(qevVarB);
                obj = qevVarB.b;
            } else {
                try {
                    qev qevVar = (qev) E(cnb.b, new cmy(strA2, context, cmxVar, i), i2);
                    ebnVar.x(qevVar);
                    obj = qevVar.b;
                } catch (InterruptedException unused) {
                    ebnVar.x(new qev(-3, (byte[]) null));
                }
            }
        }
        return (Typeface) obj;
    }

    private static IOException H(File file, IOException iOException) {
        StringBuilder sb = new StringBuilder("Inoperable file:");
        try {
            sb.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + ']');
        } catch (IOException unused) {
            sb.append(" failed to attach additional metadata");
        }
        return new IOException(sb.toString(), iOException);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int I(java.nio.ByteBuffer r5, int r6) {
        /*
        L0:
            int r0 = r5.limit()
            int r0 = r0 + (-4)
            r1 = 0
            r2 = 1
            if (r6 > r0) goto L2d
            int r0 = r5.getInt(r6)
            r3 = r0 & (-256(0xffffffffffffff00, float:NaN))
            r4 = 256(0x100, float:3.59E-43)
            if (r3 != r4) goto L15
            goto L4b
        L15:
            int r6 = r6 + 1
            if (r3 != 0) goto L1b
            r3 = r2
            goto L1c
        L1b:
            r3 = r1
        L1c:
            java.lang.String r4 = "Invalid Nal units"
            y(r3, r4)
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 != r2) goto L26
            return r6
        L26:
            if (r0 != 0) goto L29
            r1 = r2
        L29:
            y(r1, r4)
            goto L0
        L2d:
            int r0 = r5.limit()
            int r0 = r0 + (-3)
            java.lang.String r3 = "Invalid NAL units"
            if (r6 > r0) goto L53
            short r0 = r5.getShort(r6)
            if (r0 != 0) goto L3f
            r0 = r2
            goto L40
        L3f:
            r0 = r1
        L40:
            y(r0, r3)
            int r0 = r6 + 2
            byte r0 = r5.get(r0)
            if (r0 != r2) goto L4c
        L4b:
            return r6
        L4c:
            if (r0 != 0) goto L4f
            r1 = r2
        L4f:
            y(r1, r3)
            goto L68
        L53:
            int r0 = r5.limit()
            if (r6 >= r0) goto L68
            byte r0 = r5.get(r6)
            if (r0 != 0) goto L61
            r0 = r2
            goto L62
        L61:
            r0 = r1
        L62:
            y(r0, r3)
            int r6 = r6 + 1
            goto L53
        L68:
            int r5 = r5.limit()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coi.I(java.nio.ByteBuffer, int):int");
    }

    public static void j(View view, PointerIcon pointerIcon) {
        view.setPointerIcon(pointerIcon);
    }

    public static void l(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (viewParent instanceof cnw) {
            ((cnw) viewParent).f(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof cnv) {
            ((cnv) viewParent).e(view, i, i2, i3, i4, i5);
        } else if (i5 == 0) {
            try {
                viewParent.onNestedScroll(view, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", a.bz(viewParent, "ViewParent ", " does not implement interface method onNestedScroll"), e);
            }
        }
    }

    public static void m(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof cnv) {
            ((cnv) viewParent).g(view, view2, i, i2);
        } else if (i2 == 0) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", a.bz(viewParent, "ViewParent ", " does not implement interface method onNestedScrollAccepted"), e);
            }
        }
    }

    public static void n(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof cnv) {
            ((cnv) viewParent).h(view, i);
        } else if (i == 0) {
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", a.bz(viewParent, "ViewParent ", " does not implement interface method onStopNestedScroll"), e);
            }
        }
    }

    public static boolean o(ViewParent viewParent, View view, float f, float f2, boolean z) {
        try {
            return viewParent.onNestedFling(view, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", a.bz(viewParent, "ViewParent ", " does not implement interface method onNestedFling"), e);
            return false;
        }
    }

    public static boolean p(ViewParent viewParent, View view, float f, float f2) {
        try {
            return viewParent.onNestedPreFling(view, f, f2);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", a.bz(viewParent, "ViewParent ", " does not implement interface method onNestedPreFling"), e);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object r(java.io.File r4, defpackage.uiq r5, defpackage.uhb r6) throws java.io.IOException {
        /*
            boolean r0 = r6 instanceof defpackage.csc
            if (r0 == 0) goto L13
            r0 = r6
            csc r0 = (defpackage.csc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            csc r0 = new csc
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            uhi r1 = defpackage.uhi.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.a
            defpackage.rnt.aN(r6)     // Catch: java.io.IOException -> L29
            return r6
        L29:
            r5 = move-exception
            goto L42
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.rnt.aN(r6)
            r0.a = r4     // Catch: java.io.IOException -> L29
            r0.c = r3     // Catch: java.io.IOException -> L29
            java.lang.Object r4 = r5.a(r0)     // Catch: java.io.IOException -> L29
            if (r4 != r1) goto L41
            return r1
        L41:
            return r4
        L42:
            boolean r6 = r5 instanceof defpackage.cqt
            if (r6 != 0) goto La8
            r4.getClass()
            java.io.File r4 = (java.io.File) r4
            boolean r6 = r4.exists()
            if (r6 == 0) goto La3
            boolean r6 = r4.isFile()
            if (r6 == 0) goto L7d
            boolean r6 = r4.canRead()
            if (r6 == 0) goto L6d
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L68
            java.io.IOException r4 = s(r4, r5)
            goto La7
        L68:
            java.io.IOException r4 = s(r4, r5)
            goto La7
        L6d:
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L78
            java.io.IOException r4 = s(r4, r5)
            goto La7
        L78:
            java.io.IOException r4 = s(r4, r5)
            goto La7
        L7d:
            boolean r6 = r4.canRead()
            if (r6 == 0) goto L93
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L8e
            java.io.IOException r4 = s(r4, r5)
            goto La7
        L8e:
            java.io.IOException r4 = s(r4, r5)
            goto La7
        L93:
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L9e
            java.io.IOException r4 = s(r4, r5)
            goto La7
        L9e:
            java.io.IOException r4 = s(r4, r5)
            goto La7
        La3:
            java.io.IOException r4 = s(r4, r5)
        La7:
            throw r4
        La8:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coi.r(java.io.File, uiq, uhb):java.lang.Object");
    }

    public static IOException s(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        return parentFile == null ? H(file, iOException) : parentFile.exists() ? parentFile.isFile() ? parentFile.canRead() ? parentFile.canWrite() ? H(file, iOException) : H(file, iOException) : parentFile.canWrite() ? H(file, iOException) : H(file, iOException) : parentFile.canRead() ? parentFile.canWrite() ? H(file, iOException) : H(file, iOException) : parentFile.canWrite() ? H(file, iOException) : H(file, iOException) : H(file, iOException);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.sbp t(java.nio.ByteBuffer r7) {
        /*
            int r0 = r7.remaining()
            if (r0 != 0) goto Lb
            int r7 = defpackage.sbp.d
            sbp r7 = defpackage.sex.a
            return r7
        Lb:
            java.nio.ByteBuffer r7 = r7.asReadOnlyBuffer()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r7.order(r0)
            int r0 = r7.position()
            int r0 = I(r7, r0)
            int r0 = r0 + 3
            sbk r1 = new sbk
            r1.<init>()
            r2 = 1
            r3 = r0
            r4 = r2
        L26:
            int r5 = r7.limit()
            if (r0 >= r5) goto La0
            if (r4 != 0) goto L3d
            int r0 = I(r7, r0)
            int r3 = r7.limit()
            if (r0 == r3) goto La0
            int r3 = r0 + 3
            r4 = r2
            r0 = r3
            goto L26
        L3d:
            int r4 = r7.limit()
            int r4 = r4 + (-4)
            if (r0 > r4) goto L6e
            int r4 = r7.getInt(r0)
            r5 = r4 & (-256(0xffffffffffffff00, float:NaN))
            if (r5 == 0) goto L8a
            r6 = 256(0x100, float:3.59E-43)
            if (r5 != r6) goto L52
            goto L8a
        L52:
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r5 & r4
            if (r5 == 0) goto L6b
            if (r5 != r2) goto L5b
            goto L6b
        L5b:
            char r5 = (char) r4
            if (r5 != 0) goto L61
            int r0 = r0 + 2
            goto L3d
        L61:
            r4 = r4 & 255(0xff, float:3.57E-43)
            if (r4 != 0) goto L68
            int r0 = r0 + 3
            goto L3d
        L68:
            int r0 = r0 + 4
            goto L3d
        L6b:
            int r0 = r0 + 1
            goto L8a
        L6e:
            int r4 = r7.limit()
            int r4 = r4 + (-3)
            if (r0 != r4) goto L86
            short r4 = r7.getShort(r0)
            int r5 = r0 + 2
            byte r5 = r7.get(r5)
            if (r4 != 0) goto L86
            if (r5 == 0) goto L8a
            if (r5 == r2) goto L8a
        L86:
            int r0 = r7.limit()
        L8a:
            int r4 = r0 - r3
            java.nio.ByteBuffer r5 = r7.duplicate()
            r5.position(r3)
            int r4 = r4 + r3
            r5.limit(r4)
            java.nio.ByteBuffer r4 = r5.slice()
            r1.h(r4)
            r4 = 0
            goto L26
        La0:
            sbp r7 = r1.g()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coi.t(java.nio.ByteBuffer):sbp");
    }

    public static int u(MediaFormat mediaFormat, String str, int i) {
        return mediaFormat.containsKey(str) ? mediaFormat.getInteger(str) : i;
    }

    public static Integer v(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("time-lapse-enable") && mediaFormat.getInteger("time-lapse-enable") > 0 && mediaFormat.containsKey("time-lapse-fps")) {
            return Integer.valueOf(mediaFormat.getInteger("time-lapse-fps"));
        }
        return null;
    }

    public static void w(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void x(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void y(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }

    public static void z(Object obj) {
        obj.getClass();
    }

    public View a(MenuItem menuItem) {
        throw null;
    }

    public void b(SubMenu subMenu) {
        throw null;
    }

    public boolean c() {
        throw null;
    }

    public boolean d() {
        throw null;
    }

    public boolean e() {
        throw null;
    }

    public boolean f() {
        throw null;
    }

    public void g(AmbientMode.AmbientController ambientController) {
        throw null;
    }

    public void h(int i) {
    }

    public void i(Typeface typeface) {
    }

    public static void k(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof cnv) {
            ((cnv) viewParent).d(view, i, i2, iArr, i3);
            return;
        }
        if (i3 == 0) {
            try {
                viewParent.onNestedPreScroll(view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e(TOnSyMaYeslEl.svvMur, a.bz(viewParent, "ViewParent ", " does not implement interface method onNestedPreScroll"), e);
            }
        }
    }

    public static boolean q(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof cnv) {
            return ((cnv) viewParent).t(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        try {
            return viewParent.onStartNestedScroll(view, view2, i);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", a.bz(viewParent, uCzt.wndHAE, " does not implement interface method onStartNestedScroll"), e);
            return false;
        }
    }
}
