package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import com.google.android.apps.camera.backup.cNHl.ibINv;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjc implements View.OnAttachStateChangeListener, cvt {
    public final bxv a;
    public boolean d;
    public byz h;
    private final uif i;
    private long m;
    private byz n;
    private final List j = new ArrayList();
    public int g = 1;
    public boolean b = true;
    private final uqm k = ukc.P(1, 0, null, 6);
    public final Handler c = new Handler(Looper.getMainLooper());
    private yq l = yr.a();
    public final yq f = new yq((byte[]) null);
    public final Runnable e = new Runnable() { // from class: biz
        /* JADX WARN: Code restructure failed: missing block: B:137:0x02d9, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:139:0x02dd, code lost:
        
            throw r0;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 734
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.biz.run():void");
        }
    };

    public bjc(bxv bxvVar, uif uifVar) {
        this.a = bxvVar;
        this.i = uifVar;
        this.h = new byz(bxvVar.J.c(), yr.a());
    }

    private final void i(cbr cbrVar, uiu uiuVar) {
        List listJ = cbrVar.j();
        int size = listJ.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = listJ.get(i2);
            if (a().b(((cbr) obj).e)) {
                uiuVar.a(Integer.valueOf(i), obj);
                i++;
            }
        }
    }

    private final void j() {
        byz byzVar = this.n;
        if (byzVar == null) {
            return;
        }
        List list = this.j;
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bjd bjdVar = (bjd) list.get(i);
            if (bjdVar.b - 1 != 0) {
                AutofillId autofillIdC = byzVar.c(bjdVar.a);
                if (autofillIdC != null) {
                    ((ContentCaptureSession) byzVar.b).notifyViewDisappeared(autofillIdC);
                }
            } else {
                ejs ejsVar = bjdVar.c;
                if (ejsVar != null) {
                    ((ContentCaptureSession) byzVar.b).notifyViewAppeared((ViewStructure) ejsVar.a);
                }
            }
        }
        ((ContentCaptureSession) byzVar.b).notifyViewsDisappeared((AutofillId) byx.o((View) byzVar.a).a, new long[]{Long.MIN_VALUE});
        list.clear();
    }

    private final void k(cbr cbrVar) {
        if (g()) {
            c(cbrVar.e);
            List listJ = cbrVar.j();
            int size = listJ.size();
            for (int i = 0; i < size; i++) {
                k((cbr) listJ.get(i));
            }
        }
    }

    public final yq a() {
        if (this.b) {
            this.b = false;
            this.l = cbs.c(this.a.J);
            this.m = System.currentTimeMillis();
        }
        return this.l;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0078 -> B:17:0x0043). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.uhb r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.bja
            if (r0 == 0) goto L13
            r0 = r8
            bja r0 = (defpackage.bja) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bja r0 = new bja
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            uqa r2 = r0.d
            defpackage.rnt.aN(r8)
            goto L43
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            uqa r2 = r0.d
            defpackage.rnt.aN(r8)
            goto L4d
        L3a:
            defpackage.rnt.aN(r8)
            uqm r8 = r7.k
            uqa r2 = r8.A()
        L43:
            r0.d = r2
            r0.c = r4
            java.lang.Object r8 = r2.a(r0)
            if (r8 == r1) goto L7e
        L4d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L7b
            r2.b()
            boolean r8 = r7.g()
            if (r8 == 0) goto L61
            r7.j()
        L61:
            boolean r8 = r7.d
            if (r8 != 0) goto L6e
            r7.d = r4
            android.os.Handler r8 = r7.c
            java.lang.Runnable r5 = r7.e
            r8.post(r5)
        L6e:
            r0.d = r2
            r0.c = r3
            r5 = 100
            java.lang.Object r8 = defpackage.ung.e(r5, r0)
            if (r8 != r1) goto L43
            goto L7e
        L7b:
            ufg r7 = defpackage.ufg.a
            return r7
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bjc.b(uhb):java.lang.Object");
    }

    public final void c(int i) {
        this.j.add(new bjd(i, this.m, 2, null));
    }

    public final void d() {
        this.k.j(ufg.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(int r17, defpackage.cbr r18) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bjc.f(int, cbr):void");
    }

    public final boolean g() {
        return this.n != null;
    }

    public final void h(cbr cbrVar, byz byzVar) {
        i(cbrVar, new bsm(byzVar, this, 1));
        List listJ = cbrVar.j();
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            cbr cbrVar2 = (cbr) listJ.get(i);
            yq yqVarA = a();
            int i2 = cbrVar2.e;
            if (yqVarA.b(i2)) {
                yq yqVar = this.f;
                if (yqVar.b(i2)) {
                    Object objA = yqVar.a(i2);
                    if (objA == null) {
                        bqs.a("node not present in pruned tree before this change");
                        throw new uer();
                    }
                    h(cbrVar2, (byz) objA);
                } else {
                    continue;
                }
            }
        }
    }

    @Override // defpackage.cvt
    public final /* synthetic */ void onCreate(cwh cwhVar) {
    }

    @Override // defpackage.cvt
    public final /* synthetic */ void onDestroy(cwh cwhVar) {
    }

    @Override // defpackage.cvt
    public final /* synthetic */ void onPause(cwh cwhVar) {
    }

    @Override // defpackage.cvt
    public final /* synthetic */ void onResume(cwh cwhVar) {
    }

    @Override // defpackage.cvt
    public final void onStart(cwh cwhVar) {
        this.n = (byz) this.i.a();
        f(-1, this.a.J.c());
        j();
    }

    @Override // defpackage.cvt
    public final void onStop(cwh cwhVar) {
        k(this.a.J.c());
        j();
        this.n = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.c.removeCallbacks(this.e);
        this.n = null;
    }

    public final void e(int i, String str) {
        byz byzVar = this.n;
        if (byzVar == null) {
            return;
        }
        AutofillId autofillIdC = byzVar.c(i);
        if (autofillIdC != null) {
            ((ContentCaptureSession) byzVar.b).notifyViewTextChanged(autofillIdC, str);
        } else {
            bqs.a(ibINv.vCbOAfdGGvsWqO);
            throw new uer();
        }
    }
}
