package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Process;
import android.util.Log;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.android.material.button.MaterialButton;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class qly implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ qly(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r8v46, types: [java.lang.Object, rww] */
    /* JADX WARN: Type inference failed for: r8v51, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r8v52, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        syu syuVarE;
        rnx rnxVarA;
        Context context;
        int iA = 0;
        switch (this.b) {
            case 0:
                Object obj = this.a;
                qlz qlzVar = (qlz) obj;
                synchronized (qlzVar.a) {
                    rnt.L(((qlz) obj).d);
                    Runnable runnable = (Runnable) ((qlz) obj).c.pollFirst();
                    if (runnable == null) {
                        ((qlz) obj).d = false;
                        return;
                    }
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        Log.e("SingleTaskExec", "Exception occurred on single-threaded executor", th);
                    }
                    qlzVar.b.execute(new qly(obj, iA));
                    return;
                }
            case 1:
                qlw qlwVar = (qlw) this.a;
                qlwVar.d.e(null);
                qlwVar.a();
                return;
            case 2:
                rcg rcgVar = (rcg) ((rcg) this.a).d;
                ((qoa) rcgVar.d).a(new qoh(rcgVar));
                return;
            case 3:
                ((qrb) this.a).a();
                return;
            case 4:
                final qsg qsgVar = (qsg) this.a;
                ske.R(new sxh() { // from class: qsf
                    /* JADX WARN: Removed duplicated region for block: B:188:0x03bd  */
                    /* JADX WARN: Removed duplicated region for block: B:190:0x03c7  */
                    /* JADX WARN: Removed duplicated region for block: B:257:0x0381 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object, uem] */
                    /* JADX WARN: Type inference failed for: r3v11, types: [sgt, shi] */
                    /* JADX WARN: Type inference failed for: r3v15, types: [sgt, shi] */
                    /* JADX WARN: Type inference failed for: r5v10, types: [sgt, shi] */
                    @Override // defpackage.sxh
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final defpackage.syu a() throws java.lang.Throwable {
                        /*
                            Method dump skipped, instructions count: 1382
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.qsf.a():syu");
                    }
                }, qsgVar.e);
                return;
            case 5:
                Object obj2 = this.a;
                try {
                    AtomicReference atomicReference = ((qvf) obj2).b;
                    qpf qpfVar = ((qvf) obj2).c;
                    tzj tzjVar = ((qvf) obj2).a;
                    atomicReference.set(qpfVar.c(((qvd) tzjVar.a()).c() ? ((qvd) tzjVar.a()).a : 0.0f));
                    return;
                } catch (Throwable unused) {
                    qvf qvfVar = (qvf) obj2;
                    qvfVar.b.set(qvfVar.c.c(0.0f));
                    return;
                }
            case 6:
                ((BroadcastReceiver.PendingResult) this.a).finish();
                return;
            case 7:
                ((qzm) this.a).a();
                return;
            case 8:
                qzm qzmVar = (qzm) this.a;
                if (qzmVar.f) {
                    qxf qxfVar = qzmVar.b;
                    if (prt.f(qxfVar.c)) {
                        qzm.a.b(qxfVar);
                        return;
                    }
                }
                qzmVar.c();
                return;
            case 9:
                tag tagVar = tag.FILE;
                qsz qszVar = new qsz();
                Object obj3 = this.a;
                qzm qzmVar2 = (qzm) obj3;
                qzw qzwVar = qzmVar2.b.g;
                qzx qzxVar = (qzx) qzwVar.c.fr();
                if (qzxVar == null) {
                    syuVarE = syq.a;
                } else {
                    int i = tagVar.h;
                    a.I(true);
                    int i2 = 1 << i;
                    if ((qzwVar.e & i2) == 0) {
                        CopyOnWriteArrayList copyOnWriteArrayList = qzwVar.f;
                        synchronized (copyOnWriteArrayList) {
                            int i3 = qzwVar.e;
                            if ((i3 & i2) == 0) {
                                copyOnWriteArrayList.add(qszVar);
                                qzwVar.e = i2 | i3;
                            }
                        }
                    }
                    syuVarE = qzwVar.h;
                    if (syuVarE == null) {
                        synchronized (qzwVar.g) {
                            syuVarE = qzwVar.h;
                            if (syuVarE == null) {
                                Context context2 = qzwVar.a;
                                if (prt.f(context2)) {
                                    ndk ndkVar = new ndk(19);
                                    rww rwwVar = qzwVar.b;
                                    syuVarE = swz.j(prt.d(context2, ndkVar, (Executor) rwwVar.fr()), new pzn(qzwVar, qzxVar, 20), (Executor) rwwVar.fr());
                                    qzwVar.h = syuVarE;
                                } else {
                                    syuVarE = ((qqe) qzwVar.d.fr()).e(new qzv(qzwVar, qzxVar));
                                    qzwVar.h = syuVarE;
                                }
                            }
                        }
                    }
                }
                syuVarE.c(new ovw(obj3, syuVarE, 16), qzmVar2.b.b());
                return;
            case 10:
                Object obj4 = this.a;
                Iterator it = ((qzl) obj4).b.values().iterator();
                while (it.hasNext()) {
                    qzm[] qzmVarArr = (qzm[]) ((AtomicReference) it.next()).get();
                    if (qzmVarArr != null) {
                        for (qzm qzmVar3 : qzmVarArr) {
                            qzl qzlVar = qzm.a;
                            if (qzmVar3.f) {
                                qzmVar3.c();
                            }
                        }
                    }
                }
                synchronized (obj4) {
                    ((qzl) obj4).a = null;
                }
                return;
            case 11:
                throw new RuntimeException(((ExecutionException) this.a).getCause());
            case 12:
                if (((Boolean) ((qzx) this.a).c.fr()).booleanValue()) {
                    Process.killProcess(Process.myPid());
                    System.exit(0);
                    return;
                }
                return;
            case 13:
                try {
                    ske.U(this.a);
                    return;
                } catch (Exception unused2) {
                    return;
                }
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                String str = rfg.a;
                this.a.run();
                return;
            case 15:
                MaterialButton materialButton = (MaterialButton) this.a;
                if (materialButton.l && materialButton.n && (rnxVarA = materialButton.j.a()) != null) {
                    iA = (int) (rnxVarA.a() * 0.11f);
                }
                materialButton.m = iA;
                materialButton.p();
                materialButton.invalidate();
                return;
            case 16:
                ((rlw) this.a).e();
                return;
            case 17:
                rlw rlwVar = (rlw) this.a;
                ((rmp) rlwVar.getCurrentDrawable()).l(false, false, true);
                if (rlwVar.getProgressDrawable() == null || !rlwVar.getProgressDrawable().isVisible()) {
                    if (rlwVar.getIndeterminateDrawable() == null || !rlwVar.getIndeterminateDrawable().isVisible()) {
                        rlwVar.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                row rowVar = (row) this.a;
                rov rovVar = rowVar.j;
                if (rovVar == null || (context = rowVar.i) == null) {
                    return;
                }
                int iHeight = ((WindowManager) context.getSystemService("window")).getCurrentWindowMetrics().getBounds().height();
                int[] iArr = new int[2];
                rovVar.getLocationInWindow(iArr);
                int height = iHeight - (iArr[1] + rovVar.getHeight());
                int translationY = (int) rovVar.getTranslationY();
                int i4 = rowVar.o;
                int i5 = height + translationY;
                if (i5 >= i4) {
                    rowVar.p = i4;
                    return;
                }
                ViewGroup.LayoutParams layoutParams = rovVar.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    Log.w(row.b, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                    return;
                }
                rowVar.p = rowVar.o;
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += rowVar.o - i5;
                rovVar.requestLayout();
                return;
            case 19:
                ((row) this.a).j();
                return;
            default:
                Object obj5 = this.a;
                row rowVar2 = (row) obj5;
                rov rovVar2 = rowVar2.j;
                if (rovVar2 == null) {
                    return;
                }
                if (rovVar2.getParent() != null) {
                    rovVar2.setVisibility(0);
                }
                if (rovVar2.c == 1) {
                    ValueAnimator valueAnimatorC = rowVar2.c(0.0f, 1.0f);
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
                    valueAnimatorOfFloat.setInterpolator(rowVar2.g);
                    valueAnimatorOfFloat.addUpdateListener(new roo(obj5, 2));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(valueAnimatorC, valueAnimatorOfFloat);
                    animatorSet.setDuration(rowVar2.c);
                    animatorSet.addListener(new rot(rowVar2));
                    animatorSet.start();
                    return;
                }
                int iB = rowVar2.b();
                rovVar2.setTranslationY(iB);
                ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.setIntValues(iB, 0);
                valueAnimator.setInterpolator(rowVar2.f);
                valueAnimator.setDuration(rowVar2.e);
                valueAnimator.addListener(new rop(rowVar2));
                valueAnimator.addUpdateListener(new roo(obj5, 3));
                valueAnimator.start();
                return;
        }
    }

    public qly(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
