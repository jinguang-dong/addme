package defpackage;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.os.Trace;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.preference.PreferenceGroup;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mb implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [android.animation.ValueAnimator$DurationScaleChangeListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object, java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r15v14, types: [java.lang.Object, uif] */
    /* JADX WARN: Type inference failed for: r15v16, types: [java.lang.Object, uif] */
    /* JADX WARN: Type inference failed for: r15v40, types: [dtz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v41, types: [dub, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v44, types: [cnh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v45, types: [java.lang.Object, uol] */
    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        switch (this.b) {
            case 0:
                Toolbar toolbar = (Toolbar) this.a;
                ArrayList arrayList = toolbar.w;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    toolbar.f().removeItem(((MenuItem) arrayList.get(i)).getItemId());
                }
                Menu menuF = toolbar.f();
                ArrayList arrayListI = toolbar.i();
                toolbar.C.p(menuF, toolbar.g());
                ArrayList arrayListI2 = toolbar.i();
                arrayListI2.removeAll(arrayListI);
                toolbar.w = arrayListI2;
                return;
            case 1:
                ((Toolbar) this.a).j();
                return;
            case 2:
                ((Toolbar) this.a).w();
                return;
            case 3:
                nf nfVar = (nf) this.a;
                Runnable runnable = nfVar.a;
                if (runnable != null) {
                    runnable.run();
                    nfVar.a = null;
                    return;
                }
                return;
            case 4:
                ni.f((ni) this.a);
                return;
            case 5:
                ?? r15 = this.a;
                r15.shutdownNow();
                r15.awaitTermination(1L, TimeUnit.SECONDS);
                return;
            case 6:
                avc avcVar = (avc) this.a;
                avh avhVar = avcVar.b;
                if (avhVar != null) {
                    avhVar.setState(avc.a);
                }
                avcVar.d = null;
                return;
            case 7:
                Class cls = bxv.a;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                try {
                    this.a.a();
                    return;
                } finally {
                    Trace.endSection();
                }
            case 8:
                this.a.a();
                return;
            case 9:
                ((cmd) this.a).b();
                return;
            case 10:
                cqg cqgVar = (cqg) this.a;
                if (cqgVar.e) {
                    if (cqgVar.c) {
                        cqgVar.c = false;
                        cqf cqfVar = cqgVar.a;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        cqfVar.e = jCurrentAnimationTimeMillis;
                        cqfVar.g = -1L;
                        cqfVar.f = jCurrentAnimationTimeMillis;
                        cqfVar.h = 0.5f;
                    }
                    cqf cqfVar2 = cqgVar.a;
                    if ((cqfVar2.g > 0 && AnimationUtils.currentAnimationTimeMillis() > cqfVar2.g + cqfVar2.i) || !cqgVar.b()) {
                        cqgVar.e = false;
                        return;
                    }
                    if (cqgVar.d) {
                        cqgVar.d = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        cqgVar.b.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (cqfVar2.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = cqfVar2.a(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - cqfVar2.f;
                    cqfVar2.f = jCurrentAnimationTimeMillis2;
                    cqgVar.f.scrollListBy((int) (j * (((-4.0f) * fA * fA) + (fA * 4.0f)) * cqfVar2.d));
                    View view = cqgVar.b;
                    int[] iArr = con.a;
                    view.postOnAnimation(this);
                    return;
                }
                return;
            case 11:
                Object obj = ((csv) this.a).g.a;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                long jUptimeMillis3 = SystemClock.uptimeMillis();
                int i2 = 0;
                while (true) {
                    csv csvVar = (csv) obj;
                    ArrayList arrayList2 = csvVar.b;
                    if (i2 >= arrayList2.size()) {
                        if (csvVar.d) {
                            int size2 = arrayList2.size();
                            while (true) {
                                size2--;
                                if (size2 < 0) {
                                    if (arrayList2.size() == 0) {
                                        csu csuVar = csvVar.f;
                                        ValueAnimator.unregisterDurationScaleChangeListener(csuVar.a);
                                        csuVar.a = null;
                                    }
                                    csvVar.d = false;
                                } else if (arrayList2.get(size2) == null) {
                                    arrayList2.remove(size2);
                                }
                            }
                        }
                        if (arrayList2.size() > 0) {
                            csvVar.h.i(csvVar.c);
                            return;
                        }
                        return;
                    }
                    css cssVar = (css) arrayList2.get(i2);
                    if (cssVar != null) {
                        aaa aaaVar = csvVar.a;
                        Long l = (Long) aaaVar.get(cssVar);
                        if (l == null) {
                            cssVar.a(jUptimeMillis2);
                        } else if (l.longValue() < jUptimeMillis3) {
                            aaaVar.remove(cssVar);
                            cssVar.a(jUptimeMillis2);
                        }
                    }
                    i2++;
                }
            case 12:
                dac dacVar = (dac) this.a;
                if (dacVar.ai == -1 || SystemClock.currentThreadTimeMillis() >= 1000) {
                    return;
                }
                EditText editText = dacVar.ag;
                if (editText == null || !editText.isFocused()) {
                    dacVar.E();
                    return;
                }
                if (((InputMethodManager) dacVar.ag.getContext().getSystemService("input_method")).showSoftInput(dacVar.ag, 0)) {
                    dacVar.E();
                    return;
                }
                EditText editText2 = dacVar.ag;
                Runnable runnable2 = dacVar.ah;
                editText2.removeCallbacks(runnable2);
                dacVar.ag.postDelayed(runnable2, 50L);
                return;
            case 13:
                RecyclerView recyclerView = ((dav) this.a).b;
                recyclerView.focusableViewAvailable(recyclerView);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                synchronized (this) {
                    ((PreferenceGroup) this.a).a.clear();
                }
                return;
            case 15:
                ((daz) this.a).r();
                return;
            case 16:
                String str = dtw.b;
                new IllegalArgumentException("Invalid WindowAreaInfo token");
                this.a.em();
                return;
            case 17:
                String str2 = dtw.b;
                new IllegalArgumentException("Invalid WindowAreaInfo token");
                this.a.em();
                return;
            case 18:
                ((dtt) this.a).c.em();
                return;
            case 19:
                this.a.accept(new duy(ufw.a));
                return;
            default:
                ?? r152 = this.a;
                if (r152 != 0) {
                    r152.s(null);
                    return;
                }
                return;
        }
    }

    public mb(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
