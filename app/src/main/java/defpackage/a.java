package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.coordinatorlayout.widget.pcp.OPuAVreQM;
import com.google.android.libraries.oliveoil.natives.TtaZ.VnmwoBe;
import com.google.ar.core.ImageFormat;
import com.google.ar.core.R;
import com.google.googlex.gcam.InterleavedImageU16;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public class a {
    public a() {
    }

    public static /* synthetic */ boolean B(int i) {
        return p(i, 2) || p(i, 4) || p(i, 5);
    }

    public static /* synthetic */ boolean C(long j) {
        return !q(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static /* synthetic */ boolean D(long j) {
        return !q(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static /* synthetic */ long E(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
    }

    public static /* synthetic */ void F(Appendable appendable, Object obj, uiq uiqVar) throws IOException {
        if (uiqVar != null) {
            appendable.append((CharSequence) uiqVar.a(obj));
            return;
        }
        if (obj == null || (obj instanceof CharSequence)) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }

    public static /* synthetic */ boolean G(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ Object H(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static /* synthetic */ void I(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static /* synthetic */ boolean K(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static /* synthetic */ boolean M() {
        return (nvq.r == null || nvq.s == null || nvq.q == null || nvq.v == null || nvq.t == null || nvq.u == null) ? false : true;
    }

    public static /* synthetic */ ovx N() {
        return new ovx(true);
    }

    public static /* synthetic */ owq O() {
        return new ovx(false);
    }

    public static /* synthetic */ ovx P() {
        return new ovx(false);
    }

    public static /* synthetic */ owq Q() {
        return new ovx(true);
    }

    public static /* synthetic */ owf R() {
        return new ovx(false);
    }

    public static /* synthetic */ float S(float f) {
        if (Float.isNaN(0.0f)) {
            throw new IllegalArgumentException("min is NaN");
        }
        if (Float.isNaN(1.0f)) {
            throw new IllegalArgumentException("max is NaN");
        }
        if (Float.compare(0.0f, 1.0f) <= 0) {
            return Math.min(1.0f, Math.max(f, 0.0f));
        }
        throw new IllegalArgumentException("0.0 > 1.0");
    }

    public static /* synthetic */ rwc W(uem uemVar, boolean z) {
        return !z ? rvk.a : (rwc) uemVar.a();
    }

    public static /* synthetic */ rwc X(uem uemVar, boolean z) {
        return z ? ((jaf) uemVar).b() : rvk.a;
    }

    public static /* synthetic */ float[] Y() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static /* synthetic */ Rect Z(Rect rect, float f) {
        if (f <= 0.0f) {
            return rect;
        }
        Rect rect2 = new Rect(rect);
        if (f != 1.0f) {
            float fWidth = (rect.width() / 2.0f) * f;
            float fHeight = (rect.height() / 2.0f) * f;
            rect2.left = (int) (rect.centerX() - fWidth);
            rect2.top = (int) (rect.centerY() - fHeight);
            rect2.right = (int) (rect.centerX() + fWidth);
            rect2.bottom = (int) (rect.centerY() + fHeight);
        }
        return rect2;
    }

    public static /* synthetic */ void a() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ int aA(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aB(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aC(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aD(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aE(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    public static /* synthetic */ void aF(int i) {
        if (i == 0) {
            throw null;
        }
    }

    public static /* synthetic */ float aG(float[] fArr, float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        int iMin = Math.min((int) (200.0f * f), 199);
        float f2 = f - (iMin * 0.005f);
        float f3 = fArr[iMin];
        return f3 + ((f2 / 0.005f) * (fArr[iMin + 1] - f3));
    }

    public static /* synthetic */ int aH(int i) {
        if (i != 0) {
            return i;
        }
        throw null;
    }

    public static /* synthetic */ boolean aI(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case ImageFormat.RGBA_FP16 /* 22 */:
            case 23:
            case 24:
            case 25:
            case 26:
                return true;
            default:
                return false;
        }
    }

    public static /* synthetic */ boolean aJ(int i) {
        return ay(i) != 0;
    }

    public static /* synthetic */ boolean aK(int i) {
        return aq(i) != 0;
    }

    public static /* synthetic */ boolean aL(int i) {
        return ax(i) != 0;
    }

    public static /* synthetic */ boolean aM(int i) {
        return az(i) != 0;
    }

    public static /* synthetic */ boolean aN(int i) {
        return am(i) != 0;
    }

    public static /* synthetic */ boolean aO(int i) {
        return aw(i) != 0;
    }

    public static /* synthetic */ boolean aP(int i) {
        return aE(i) != 0;
    }

    public static /* synthetic */ void aQ(int i) {
        if (i == 0) {
            throw null;
        }
    }

    public static boolean aR(int i) {
        return i == 13 || i == 14;
    }

    public static int aS(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    public static void aT(Context context) throws Resources.NotFoundException {
        context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs);
    }

    public static /* synthetic */ String aU(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }

    public static void aV(int i, View view, ViewGroup viewGroup) {
        int i2 = i - 1;
        if (i2 == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                if (ch.X(2)) {
                    Objects.toString(view);
                    Objects.toString(viewGroup2);
                }
                viewGroup2.removeView(view);
                return;
            }
            return;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (ch.X(2)) {
                    Objects.toString(view);
                }
                view.setVisibility(4);
                return;
            } else {
                if (ch.X(2)) {
                    Objects.toString(view);
                }
                view.setVisibility(8);
                return;
            }
        }
        if (ch.X(2)) {
            Objects.toString(view);
        }
        ViewParent parent2 = view.getParent();
        if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
            if (ch.X(2)) {
                Objects.toString(view);
                Objects.toString(viewGroup);
            }
            viewGroup.addView(view);
        }
        view.setVisibility(0);
    }

    public static int aW(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 4) {
            return 4;
        }
        if (i == 8) {
            return 3;
        }
        throw new IllegalArgumentException(bv(i, "Unknown visibility "));
    }

    public static int aX(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return aW(view.getVisibility());
    }

    public static /* synthetic */ String aY(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }

    public static float aZ(caa caaVar, int i) {
        return p(i, 2) ? caaVar.b() * 0.0069444445f : caaVar.b();
    }

    public static /* synthetic */ float aa(dkl dklVar, int i) {
        return dklVar.c - (p(i, 0) ? dklVar.d / 2.0f : 0.0f);
    }

    public static /* synthetic */ ufg ab(cbn cbnVar) {
        cbnVar.getClass();
        cbx.a(cbnVar);
        return ufg.a;
    }

    public static /* synthetic */ long ac(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
    }

    public static /* synthetic */ int[] ad() {
        return new int[]{1, 2, 3, 4, 5, 6};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void ae(Object obj) throws Exception {
        if (obj instanceof AutoCloseable) {
            obj.close();
            return;
        }
        if (obj instanceof ExecutorService) {
            s((ExecutorService) obj);
            return;
        }
        if (obj instanceof TypedArray) {
            ((TypedArray) obj).recycle();
            return;
        }
        if (obj instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) obj).release();
            return;
        }
        if (obj instanceof MediaDrm) {
            ((MediaDrm) obj).release();
        } else if (obj instanceof DrmManagerClient) {
            ((DrmManagerClient) obj).release();
        } else {
            if (!(obj instanceof ContentProviderClient)) {
                throw new IllegalArgumentException();
            }
            ((ContentProviderClient) obj).release();
        }
    }

    public static /* synthetic */ Object af() {
        return false;
    }

    public static /* synthetic */ Object ag(Object obj, Object obj2) {
        ayc aycVar = (ayc) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (!aycVar.H((iIntValue & 3) != 2, iIntValue & 1)) {
            aycVar.r();
        }
        return ufg.a;
    }

    public static /* synthetic */ int ah(int i) {
        return i - 1;
    }

    public static /* synthetic */ void ai(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(bu(i2, i, "index: ", ", size: "));
        }
    }

    public static /* synthetic */ void aj(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(bu(i2, i, "index: ", ", size: "));
        }
    }

    public static /* synthetic */ void ak(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i > i2) {
                throw new IllegalArgumentException(bu(i2, i, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
    }

    public static /* synthetic */ int al(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i != 3) {
            return i != 4 ? 0 : 6;
        }
        return 5;
    }

    public static /* synthetic */ int am(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static /* synthetic */ int[] an() {
        return new int[]{1, 2, 3};
    }

    public static /* synthetic */ boolean ao(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static /* synthetic */ InterleavedImageU16 ap(syu syuVar) {
        try {
            return (InterleavedImageU16) syuVar.get(100L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return new InterleavedImageU16();
        } catch (CancellationException | ExecutionException | TimeoutException unused2) {
            return new InterleavedImageU16();
        }
    }

    public static /* synthetic */ int aq(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static /* synthetic */ int ar(int i) {
        return i - 2;
    }

    public static /* synthetic */ int as(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static /* synthetic */ int at(int i) {
        return i - 2;
    }

    public static /* synthetic */ int au(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static /* synthetic */ int av(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int aw(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 5 ? 0 : 6;
        }
        return 5;
    }

    public static /* synthetic */ int ax(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static /* synthetic */ int ay(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static /* synthetic */ int az(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            default:
                return 0;
        }
    }

    public static /* synthetic */ boolean b() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ String bA(Object obj, Object obj2, String str, String str2, String str3) {
        return str + obj2 + str2 + obj + str3;
    }

    public static /* synthetic */ String bB(String str, AttributeSet attributeSet, String str2) {
        return attributeSet.getPositionDescription() + str2 + str;
    }

    public static /* synthetic */ String bC(Object obj, Object obj2, String str, String str2) {
        return str + obj2 + str2 + obj;
    }

    public static /* synthetic */ String bD(int i, int i2, String str, String str2, String str3) {
        return str + i2 + str2 + i + str3;
    }

    public static /* synthetic */ String bE(int i, String str, String str2) {
        return str + i + str2;
    }

    private static int bF(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static Object ba(bqc bqcVar, uiv uivVar, uiq uiqVar, uif uifVar, uif uifVar2, aii aiiVar, uiu uiuVar, uhb uhbVar) {
        Object objU = e.u(bqcVar, new ahc(uifVar2, new ujz(), aiiVar, uivVar, uiuVar, uifVar, uiqVar, null), uhbVar);
        return objU == uhi.a ? objU : ufg.a;
    }

    public static boolean bb(bpp bppVar, long j) {
        Object obj;
        List list = bppVar.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (q(((bpv) obj).a, j)) {
                break;
            }
            i++;
        }
        bpv bpvVar = (bpv) obj;
        return bpvVar == null || !bpvVar.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ae, code lost:
    
        if (defpackage.akg.C(r6) != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0059 -> B:22:0x005c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object bc(defpackage.bqk r12, long r13, defpackage.uhb r15) {
        /*
            boolean r0 = r15 instanceof defpackage.agy
            if (r0 == 0) goto L13
            r0 = r15
            agy r0 = (defpackage.agy) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            agy r0 = new agy
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.b
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            ujz r12 = r0.c
            bqk r13 = r0.d
            defpackage.rnt.aN(r15)
            r11 = r13
            r13 = r12
            r12 = r11
            goto L5c
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            defpackage.rnt.aN(r15)
            bpp r15 = r12.n()
            boolean r15 = bb(r15, r13)
            if (r15 == 0) goto L45
            return r4
        L45:
            ujz r15 = new ujz
            r15.<init>()
            r15.a = r13
        L4c:
            r0.d = r12
            r0.c = r15
            r0.b = r3
            java.lang.Object r13 = defpackage.akg.D(r12, r0)
            if (r13 != r1) goto L59
            return r1
        L59:
            r11 = r15
            r15 = r13
            r13 = r11
        L5c:
            bpp r15 = (defpackage.bpp) r15
            java.util.List r14 = r15.a
            int r15 = r14.size()
            r2 = 0
            r5 = r2
        L66:
            if (r5 >= r15) goto L7d
            java.lang.Object r6 = r14.get(r5)
            r7 = r6
            bpv r7 = (defpackage.bpv) r7
            long r7 = r7.a
            long r9 = r13.a
            boolean r7 = q(r7, r9)
            if (r7 == 0) goto L7a
            goto L7e
        L7a:
            int r5 = r5 + 1
            goto L66
        L7d:
            r6 = r4
        L7e:
            bpv r6 = (defpackage.bpv) r6
            if (r6 != 0) goto L84
            r6 = r4
            goto Lb0
        L84:
            boolean r15 = defpackage.akg.A(r6)
            if (r15 == 0) goto Laa
            int r15 = r14.size()
        L8e:
            if (r2 >= r15) goto L9f
            java.lang.Object r5 = r14.get(r2)
            r7 = r5
            bpv r7 = (defpackage.bpv) r7
            boolean r7 = r7.d
            if (r7 == 0) goto L9c
            goto La0
        L9c:
            int r2 = r2 + 1
            goto L8e
        L9f:
            r5 = r4
        La0:
            bpv r5 = (defpackage.bpv) r5
            if (r5 != 0) goto La5
            goto Lb0
        La5:
            long r14 = r5.a
            r13.a = r14
            goto Lba
        Laa:
            boolean r14 = defpackage.akg.C(r6)
            if (r14 == 0) goto Lba
        Lb0:
            if (r6 == 0) goto Lb9
            boolean r12 = r6.c()
            if (r12 != 0) goto Lb9
            return r6
        Lb9:
            return r4
        Lba:
            r15 = r13
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a.bc(bqk, long, uhb):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b9, code lost:
    
        if (java.lang.Float.intBitsToFloat((int) (defpackage.akg.x(r6) >> 32)) != 0.0f) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0059 -> B:22:0x005c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object bd(defpackage.bqk r12, long r13, defpackage.uhb r15) {
        /*
            Method dump skipped, instructions count: 199
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a.bd(bqk, long, uhb):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v3, types: [uka] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object be(defpackage.bqk r9, long r10, defpackage.uhb r12) {
        /*
            boolean r0 = r12 instanceof defpackage.aha
            if (r0 == 0) goto L13
            r0 = r12
            aha r0 = (defpackage.aha) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            aha r0 = new aha
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.b
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            ujw r9 = r0.e
            uka r10 = r0.d
            bpv r11 = r0.c
            defpackage.rnt.aN(r12)     // Catch: defpackage.bpq -> La6
            goto L98
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            defpackage.rnt.aN(r12)
            bpp r12 = r9.n()
            boolean r12 = bb(r12, r10)
            if (r12 == 0) goto L44
            return r4
        L44:
            bpp r12 = r9.n()
            java.util.List r12 = r12.a
            int r2 = r12.size()
            r5 = 0
        L4f:
            if (r5 >= r2) goto L64
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            bpv r7 = (defpackage.bpv) r7
            long r7 = r7.a
            boolean r7 = q(r7, r10)
            if (r7 == 0) goto L61
            goto L65
        L61:
            int r5 = r5 + 1
            goto L4f
        L64:
            r6 = r4
        L65:
            r11 = r6
            bpv r11 = (defpackage.bpv) r11
            if (r11 != 0) goto L6b
            return r4
        L6b:
            uka r10 = new uka
            r10.<init>()
            uka r12 = new uka
            r12.<init>()
            r12.a = r11
            caa r2 = r9.o()
            long r5 = r2.d()
            ujw r2 = new ujw     // Catch: defpackage.bpq -> La6
            r2.<init>()     // Catch: defpackage.bpq -> La6
            ahb r7 = new ahb     // Catch: defpackage.bpq -> La6
            r7.<init>(r2, r12, r10, r4)     // Catch: defpackage.bpq -> La6
            r0.c = r11     // Catch: defpackage.bpq -> La6
            r0.d = r10     // Catch: defpackage.bpq -> La6
            r0.e = r2     // Catch: defpackage.bpq -> La6
            r0.b = r3     // Catch: defpackage.bpq -> La6
            java.lang.Object r9 = r9.p(r5, r7, r0)     // Catch: defpackage.bpq -> La6
            if (r9 == r1) goto La5
            r9 = r2
        L98:
            boolean r9 = r9.a     // Catch: defpackage.bpq -> La6
            if (r9 == 0) goto La4
            java.lang.Object r9 = r10.a     // Catch: defpackage.bpq -> La6
            bpv r9 = (defpackage.bpv) r9     // Catch: defpackage.bpq -> La6
            if (r9 == 0) goto La3
            return r9
        La3:
            return r11
        La4:
            return r4
        La5:
            return r1
        La6:
            java.lang.Object r9 = r10.a
            bpv r9 = (defpackage.bpv) r9
            if (r9 == 0) goto Lad
            r11 = r9
        Lad:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a.be(bqk, long, uhb):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v2, types: [uiq] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object bf(defpackage.bqk r4, long r5, defpackage.uiq r7, defpackage.uhb r8) {
        /*
            boolean r0 = r8 instanceof defpackage.ahd
            if (r0 == 0) goto L13
            r0 = r8
            ahd r0 = (defpackage.ahd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ahd r0 = new ahd
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.b
            uhi r1 = defpackage.uhi.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.a
            bqk r5 = r0.d
            defpackage.rnt.aN(r8)
            r7 = r4
            r4 = r5
            goto L45
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            defpackage.rnt.aN(r8)
        L38:
            r0.d = r4
            r0.a = r7
            r0.c = r3
            java.lang.Object r8 = bc(r4, r5, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            bpv r8 = (defpackage.bpv) r8
            if (r8 != 0) goto L4f
            r4 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L4f:
            boolean r5 = defpackage.akg.A(r8)
            if (r5 == 0) goto L5a
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        L5a:
            r7.a(r8)
            long r5 = r8.a
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a.bf(bqk, long, uiq, uhb):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ed, code lost:
    
        if (r0 != 0.0f) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:35:0x00ab, B:46:0x00cc], limit reached: 69 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x009e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0077 -> B:23:0x007d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object bg(defpackage.bqk r18, long r19, defpackage.uiq r21, defpackage.uhb r22) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a.bg(bqk, long, uiq, uhb):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f0, code lost:
    
        if (r0 != 0.0f) goto L56;
     */
    /* JADX WARN: Path cross not found for [B:35:0x00ae, B:46:0x00cf], limit reached: 69 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007a -> B:23:0x0080). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object bh(defpackage.bqk r18, long r19, defpackage.uiq r21, defpackage.uhb r22) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a.bh(bqk, long, uiq, uhb):java.lang.Object");
    }

    @ueo
    public static afv bi(ayc aycVar) {
        aycVar.u(1257603829);
        afv afvVar = afv.a;
        aycVar.n();
        return afvVar;
    }

    public static void bj(final bne bneVar, final bik bikVar, bie bieVar, brk brkVar, float f, ayc aycVar, final int i) {
        int i2;
        final bie bieVar2;
        final brk brkVar2;
        final float f2;
        ayc aycVarC = aycVar.c(1142754848);
        if ((i & 6) == 0) {
            i2 = (true != aycVarC.D(bneVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.B(null) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != aycVarC.B(bikVar) ? 128 : 256;
        }
        int i3 = i2 | 1797120;
        if (aycVarC.H((599187 & i3) != 599186, i3 & 1)) {
            bie bieVar3 = bib.j;
            brk brkVar3 = brj.b;
            aycVarC.u(1899392610);
            ayg aygVar = (ayg) aycVarC;
            aygVar.Y();
            bik bikVarA = bdq.A(bdq.D(bikVar.cM(bik.c)), bneVar, bieVar3, brkVar3, 1.0f, null, 2);
            Object objR = aygVar.R();
            if (objR == ayb.a) {
                objR = aqc.b;
                aygVar.ac(objR);
            }
            bsr bsrVar = (bsr) objR;
            int iR = r(bay.N(aycVarC));
            bik bikVarV = bay.v(aycVarC, bikVarA);
            bfk bfkVarAg = aygVar.ag();
            uif uifVar = bum.a;
            aycVarC.v();
            if (aygVar.v) {
                aycVarC.j(uifVar);
            } else {
                aycVarC.x();
            }
            bbr.a(aycVarC, bsrVar, bum.d);
            bbr.a(aycVarC, bfkVarAg, bum.c);
            bbr.a(aycVarC, bikVarV, bum.b);
            uiu uiuVar = bum.e;
            if (aygVar.v || !ao(aygVar.R(), Integer.valueOf(iR))) {
                Integer numValueOf = Integer.valueOf(iR);
                aygVar.ac(numValueOf);
                aycVarC.h(numValueOf, uiuVar);
            }
            aycVarC.m();
            f2 = 1.0f;
            bieVar2 = bieVar3;
            brkVar2 = brkVar3;
        } else {
            aycVarC.r();
            bieVar2 = bieVar;
            brkVar2 = brkVar;
            f2 = f;
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new uiu() { // from class: afm
                @Override // defpackage.uiu
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    bne bneVar2 = bneVar;
                    bik bikVar2 = bikVar;
                    bie bieVar4 = bieVar2;
                    brk brkVar4 = brkVar2;
                    a.bj(bneVar2, bikVar2, bieVar4, brkVar4, f2, (ayc) obj, bay.j(i | 1));
                    return ufg.a;
                }
            };
        }
    }

    public static void bl(String str) {
        throw new IllegalArgumentException(str);
    }

    public static void bm(String str) {
        throw new IllegalStateException(str);
    }

    public static void bn(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static void bo(String str) {
        throw new NoSuchElementException(str);
    }

    public static float bq(csu csuVar) {
        return ((xv) csuVar.a).b;
    }

    public static float br(csu csuVar) {
        return ((xv) csuVar.a).a;
    }

    public static void bs(csu csuVar) {
        if (!csuVar.c()) {
            csuVar.a(0, 0, 0, 0);
            return;
        }
        float fBq = bq(csuVar);
        float fBr = br(csuVar);
        int iCeil = (int) Math.ceil(xw.a(fBq, fBr, csuVar.b()));
        int iCeil2 = (int) Math.ceil(xw.b(fBq, fBr, csuVar.b()));
        csuVar.a(iCeil, iCeil2, iCeil, iCeil2);
    }

    public static ebn bt(Context context, bm bmVar, boolean z, boolean z2) throws Resources.NotFoundException {
        int iH;
        boolean z3;
        bi biVar = bmVar.S;
        int iBF = 0;
        int i = biVar == null ? 0 : biVar.f;
        if (z2) {
            if (z) {
                iH = bmVar.i();
                z3 = true;
            } else {
                iH = bmVar.j();
                z3 = false;
            }
        } else if (z) {
            iH = bmVar.g();
            z3 = true;
        } else {
            iH = bmVar.h();
            z3 = false;
        }
        boolean z4 = z3;
        bmVar.s(0, 0, 0, 0);
        ViewGroup viewGroup = bmVar.O;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            bmVar.O.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = bmVar.O;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        if (iH != 0) {
            iBF = iH;
        } else if (i != 0) {
            iBF = i != 4097 ? i != 8194 ? i != 8197 ? i != 4099 ? i != 4100 ? -1 : z4 ? bF(context, android.R.attr.activityOpenEnterAnimation) : bF(context, android.R.attr.activityOpenExitAnimation) : true != z3 ? R.animator.fragment_fade_exit : R.animator.fragment_fade_enter : z4 ? bF(context, android.R.attr.activityCloseEnterAnimation) : bF(context, android.R.attr.activityCloseExitAnimation) : true != z3 ? R.animator.fragment_close_exit : R.animator.fragment_close_enter : true != z3 ? R.animator.fragment_open_exit : R.animator.fragment_open_enter;
        }
        if (iBF != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iBF));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iBF);
                    if (animationLoadAnimation != null) {
                        return new ebn(animationLoadAnimation);
                    }
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            } else {
                try {
                    Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iBF);
                    if (animatorLoadAnimator != null) {
                        return new ebn(animatorLoadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (zEquals) {
                        throw e2;
                    }
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iBF);
                    if (animationLoadAnimation2 != null) {
                        return new ebn(animationLoadAnimation2);
                    }
                }
            }
        }
        return null;
    }

    public static /* synthetic */ String bu(int i, int i2, String str, String str2) {
        return str + i2 + str2 + i;
    }

    public static /* synthetic */ String bv(int i, String str) {
        return str + i;
    }

    public static /* synthetic */ String bw(String str, String str2, String str3) {
        return str2 + str + str3;
    }

    public static /* synthetic */ String bx(Object obj, String str, String str2) {
        return str + obj.toString() + str2;
    }

    public static /* synthetic */ String by(String str, String str2, String str3, String str4, String str5) {
        return str3 + str2 + str4 + str + str5;
    }

    public static /* synthetic */ String bz(Object obj, String str, String str2) {
        return str + obj + str2;
    }

    public static /* synthetic */ boolean c() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ Object e() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ Object f() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ Object g() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ void h() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ void i() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ void j() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ void k() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ boolean l() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ void m(List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((lg) list.get(size)).a.animate().cancel();
            }
        }
    }

    public static /* synthetic */ PorterDuff.Mode n(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static /* synthetic */ int o(boolean z) {
        return z ? 1231 : 1237;
    }

    public static /* synthetic */ boolean p(int i, int i2) {
        return i == i2;
    }

    public static /* synthetic */ boolean q(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ int r(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ void s(ExecutorService executorService) throws InterruptedException {
        if (executorService == ForkJoinPool.commonPool() || executorService.isTerminated()) {
            return;
        }
        executorService.shutdown();
        boolean zAwaitTermination = false;
        boolean z = false;
        while (!zAwaitTermination) {
            try {
                zAwaitTermination = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                }
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ long t(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static /* synthetic */ boolean v(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean w(AtomicReference atomicReference, Object obj) {
        while (!atomicReference.compareAndSet(obj, null)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean x(AtomicReference atomicReference, Object obj) {
        while (!atomicReference.compareAndSet(null, obj)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ ufg y(bte bteVar, btd btdVar) {
        btd.q(btdVar, bteVar, 0, 0);
        return ufg.a;
    }

    public a(byte[] bArr) {
    }

    public static /* synthetic */ Object d() {
        throw new UnsupportedOperationException(OPuAVreQM.CgpJWCAkF);
    }

    public static /* synthetic */ String L(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return VnmwoBe.ExO;
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            default:
                return "END_DOCUMENT";
        }
    }
}
