package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.widget.RadioGroup;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ipy implements mxl, jhh, jhc, jhe, jfz {
    public final ipn a;
    public final out b;
    public final owf c;
    public final owf d;
    public final owf e;
    public final uem f;
    public nkw g;
    public iqj h;
    public final fdq k;
    private final Context n;
    private final jtc o;
    private final owf p;
    private final owf q;
    private final owf r;
    private final owf s;
    private ipz u;
    private final iyu v;
    private final luj w;
    private final luj x;
    private final AtomicBoolean m = new AtomicBoolean(false);
    private boolean t = false;
    public rwc i = rvk.a;
    public int l = 1;
    public boolean j = false;

    public ipy(fdq fdqVar, iyu iyuVar, Context context, ipn ipnVar, out outVar, jtc jtcVar, owf owfVar, owf owfVar2, owf owfVar3, owf owfVar4, owf owfVar5, owf owfVar6, owf owfVar7, uem uemVar, luj lujVar, luj lujVar2) {
        this.k = fdqVar;
        this.v = iyuVar;
        this.n = context;
        this.a = ipnVar;
        this.b = outVar;
        this.o = jtcVar;
        this.c = owfVar;
        this.p = owfVar2;
        this.q = owfVar3;
        this.d = owfVar4;
        this.r = owfVar5;
        this.e = owfVar6;
        this.s = owfVar7;
        this.f = uemVar;
        this.w = lujVar;
        this.x = lujVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r4 = this;
            luj r0 = r4.w
            iqm r0 = defpackage.iqm.b(r0)
            iqm r1 = defpackage.iqm.NOT_SET
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L8c
            iqm r1 = defpackage.iqm.STANDARD
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L18
            goto L8c
        L18:
            iqh r0 = r0.a()
            iqj r1 = r4.h
            boolean r1 = r1.g(r0)
            if (r1 == 0) goto L8c
            owf r1 = r4.c
            java.lang.Object r2 = r1.dL()
            nkw r2 = (defpackage.nkw) r2
            iqj r3 = r4.h
            boolean r3 = r3.i(r2, r0)
            if (r3 == 0) goto L39
            rwc r0 = defpackage.rwc.j(r2)
            goto L5f
        L39:
            boolean r2 = r2.c()
            if (r2 == 0) goto L4e
            iqj r2 = r4.h
            nkw r3 = defpackage.nkw.VIDEO
            boolean r2 = r2.i(r3, r0)
            if (r2 == 0) goto L4e
            rwc r0 = defpackage.rwc.j(r3)
            goto L5f
        L4e:
            iqj r2 = r4.h
            nkw r3 = defpackage.nkw.PHOTO
            boolean r0 = r2.i(r3, r0)
            if (r0 == 0) goto L5d
            rwc r0 = defpackage.rwc.j(r3)
            goto L5f
        L5d:
            rvk r0 = defpackage.rvk.a
        L5f:
            boolean r2 = r0.h()
            if (r2 == 0) goto L8c
            r1.dL()
            r0.c()
            java.lang.Object r1 = r1.dL()
            nkw r1 = (defpackage.nkw) r1
            java.lang.Object r2 = r0.c()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L7f
            r4.d()
            return
        L7f:
            r4.i = r0
            jtc r4 = r4.o
            java.lang.Object r0 = r0.c()
            nkw r0 = (defpackage.nkw) r0
            r4.b(r0)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ipy.a():void");
    }

    public final void d() {
        iqh iqhVarA = iqm.b(this.w).a();
        if (iqhVarA.equals(iqh.NONE)) {
            return;
        }
        this.h.ek(iqhVarA, true);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, owf] */
    public final void e() {
        boolean z;
        int i = ((muj) this.e.dL()).b;
        if (this.t && i == 4) {
            i = 4;
            z = true;
        } else {
            z = false;
        }
        this.t = i == 2 && !((Boolean) this.d.dL()).booleanValue() && this.a.dL().floatValue() < 90.0f;
        if (this.m.get() && this.h.h(iqh.NONE) && z) {
            owf owfVar = this.q;
            if (((Boolean) owfVar.dL()).booleanValue()) {
                this.c.dL();
                owfVar.dL();
                return;
            }
            owf owfVar2 = this.c;
            if (((nkw) owfVar2.dL()).equals(nkw.PHOTO) || ((nkw) owfVar2.dL()).equals(nkw.PORTRAIT) || ((nkw) owfVar2.dL()).equals(nkw.NIGHT_SIGHT) || ((nkw) owfVar2.dL()).equals(nkw.LANDSCAPE)) {
                rwc rwcVarA = this.v.l.a();
                if (rwcVarA.h()) {
                    uh uhVarI = ((kfg) rwcVarA.c()).i();
                    if (((kfe) uhVarI.g.dL()).equals(kfe.RUNNING) || ((Boolean) ((ovx) uhVarI.a).d).booleanValue()) {
                        owfVar2.dL();
                        ((kfg) rwcVarA.c()).i().g.dL();
                        Object obj = ((ovx) ((kfg) rwcVarA.c()).i().a).d;
                        return;
                    }
                }
            }
            owf owfVar3 = this.p;
            if (((Boolean) owfVar3.dL()).booleanValue()) {
                owfVar2.dL();
                owfVar3.dL();
                return;
            }
            owf owfVar4 = this.r;
            if (((Boolean) owfVar4.dL()).booleanValue()) {
                owfVar2.dL();
                owfVar4.dL();
                return;
            }
            owf owfVar5 = this.s;
            if (((fyx) owfVar5.dL()).a()) {
                owfVar2.dL();
                owfVar5.dL();
                return;
            }
            luj lujVar = this.w;
            if (!((Boolean) lujVar.b(luf.bb)).booleanValue()) {
                a();
                return;
            }
            if (this.u == null) {
                this.u = new ipz(this.n, lujVar, this.x);
            }
            ipz ipzVar = this.u;
            ipzVar.e = new ild(this, 13);
            luj lujVar2 = ipzVar.f;
            if (iqm.b(lujVar2).equals(iqm.NOT_SET)) {
                ipzVar.g.d(luf.ba, Integer.valueOf(iqm.STANDARD.f));
            }
            ipzVar.d = Optional.of(iqm.b(lujVar2));
            RadioGroup radioGroup = ipzVar.c;
            radioGroup.setOnCheckedChangeListener(ipzVar);
            Integer num = (Integer) ipzVar.a.get(ipzVar.d.get());
            num.getClass();
            radioGroup.check(num.intValue());
            ipzVar.a();
            ipzVar.b.show();
        }
    }

    @Override // defpackage.mxl
    public final void eR(mxj mxjVar, mxm mxmVar) {
        ipz ipzVar = this.u;
        if (ipzVar != null) {
            Dialog dialog = ipzVar.b;
            if (dialog.isShowing() && mxjVar.equals(mxj.PHONE_LAYOUT)) {
                dialog.dismiss();
            }
        }
    }

    @Override // defpackage.jhc
    public final void ea() {
        this.t = false;
        this.i = rvk.a;
    }

    @Override // defpackage.jhe
    public final void eb() {
        e();
    }

    @Override // defpackage.jfz
    public final void l(boolean z) {
        this.m.set(z);
    }

    @Override // defpackage.mxl
    public final /* synthetic */ void eH(mxm mxmVar) {
    }
}
