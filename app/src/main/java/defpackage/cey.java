package defpackage;

import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cey {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public cey(qrh qrhVar, pl plVar, wq wqVar, sx sxVar) {
        qrhVar.getClass();
        sxVar.getClass();
        this.c = qrhVar;
        this.b = plVar;
        this.d = wqVar;
        this.a = sxVar;
    }

    public static /* synthetic */ void a(cey ceyVar, cfc cfcVar, Object obj) {
        cew cewVar = new cew(cfcVar);
        synchronized (ceyVar.c) {
            if (obj == null) {
                Object obj2 = ceyVar.d;
                Object obj3 = ceyVar.a;
                ((zu) obj2).j(cewVar, new cev(null));
            } else {
                ((zd) ceyVar.b).b(cewVar, new cev(obj));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.cfc r6, defpackage.uiq r7, defpackage.uhb r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.cex
            if (r0 == 0) goto L13
            r0 = r8
            cex r0 = (defpackage.cex) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cex r0 = new cex
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cew r6 = r0.d
            defpackage.rnt.aN(r8)
            goto L66
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.rnt.aN(r8)
            cew r8 = new cew
            r8.<init>(r6)
            java.lang.Object r6 = r5.c
            monitor-enter(r6)
            java.lang.Object r2 = r5.b     // Catch: java.lang.Throwable -> L8b
            zd r2 = (defpackage.zd) r2     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r2 = r2.a(r8)     // Catch: java.lang.Throwable -> L8b
            cev r2 = (defpackage.cev) r2     // Catch: java.lang.Throwable -> L8b
            if (r2 != 0) goto L52
            java.lang.Object r2 = r5.d     // Catch: java.lang.Throwable -> L8b
            zu r2 = (defpackage.zu) r2     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r2 = r2.a(r8)     // Catch: java.lang.Throwable -> L8b
            cev r2 = (defpackage.cev) r2     // Catch: java.lang.Throwable -> L8b
        L52:
            if (r2 == 0) goto L58
            java.lang.Object r5 = r2.a     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r6)
            return r5
        L58:
            monitor-exit(r6)
            r0.d = r8
            r0.c = r3
            java.lang.Object r6 = r7.a(r0)
            if (r6 == r1) goto L8a
            r4 = r8
            r8 = r6
            r6 = r4
        L66:
            java.lang.Object r7 = r5.c
            monitor-enter(r7)
            if (r8 != 0) goto L79
            java.lang.Object r5 = r5.d     // Catch: java.lang.Throwable -> L87
            cev r0 = new cev     // Catch: java.lang.Throwable -> L87
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L87
            zu r5 = (defpackage.zu) r5     // Catch: java.lang.Throwable -> L87
            r5.j(r6, r0)     // Catch: java.lang.Throwable -> L87
            goto L85
        L79:
            java.lang.Object r5 = r5.b     // Catch: java.lang.Throwable -> L87
            cev r0 = new cev     // Catch: java.lang.Throwable -> L87
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L87
            zd r5 = (defpackage.zd) r5     // Catch: java.lang.Throwable -> L87
            r5.b(r6, r0)     // Catch: java.lang.Throwable -> L87
        L85:
            monitor-exit(r7)
            return r8
        L87:
            r5 = move-exception
            monitor-exit(r7)
            throw r5
        L8a:
            return r1
        L8b:
            r5 = move-exception
            monitor-exit(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cey.b(cfc, uiq, uhb):java.lang.Object");
    }

    public final cbr c() {
        cbn cbnVar = new cbn();
        return new cbr((bij) this.a, false, (bvm) this.c, cbnVar);
    }

    public final void d(bvm bvmVar, cbn cbnVar) {
        ccm ccmVar;
        ccm ccmVar2;
        zo zoVar = (zo) this.d;
        Object[] objArr = zoVar.a;
        int i = zoVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            bit bitVar = (bit) objArr[i2];
            cbn cbnVarP = bvmVar.p();
            int i3 = bvmVar.c;
            String str = null;
            String str2 = (cbnVar == null || (ccmVar2 = (ccm) clc.ad(cbnVar, cbu.B)) == null) ? null : ccmVar2.b;
            if (cbnVarP != null && (ccmVar = (ccm) clc.ad(cbnVarP, cbu.B)) != null) {
                str = ccmVar.b;
            }
            if (str2 != str) {
                if (str2 == null) {
                    bitVar.h.ax(bitVar.a, i3, true);
                } else if (str == null) {
                    bitVar.h.ax(bitVar.a, i3, false);
                } else if (a.ao((biq) clc.ad(cbnVarP, cbu.r), biv.a)) {
                    ((AutofillManager) bitVar.h.a).notifyValueChanged(bitVar.a, i3, AutofillValue.forText(str));
                }
            }
            boolean z = cbnVar != null && bay.q(cbnVar);
            boolean z2 = cbnVarP != null && bay.q(cbnVarP);
            if (z != z2) {
                if (z2) {
                    bitVar.f.d(i3);
                } else {
                    bitVar.f.e(i3);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    public final qrh e() {
        synchronized (this.a) {
            ?? r1 = this.c;
            qrh qrhVar = (qrh) r1.get(new pc());
            if (qrhVar != null) {
                return qrhVar;
            }
            rnu rnuVar = (rnu) this.d.get(new pc());
            Object obj = rnuVar != null ? rnuVar.a : null;
            if (obj != null) {
                if (!a.ao("CXCP-Camera2", "CXCP-Camera2")) {
                    throw new IllegalStateException("Unexpected backend id! Expected CameraBackendId(value=CXCP-Camera2) but it was actually CameraBackendId(value=CXCP-Camera2)");
                }
                r1.put(new pc(), obj);
            }
            return (qrh) obj;
        }
    }

    public cey(Map map, byz byzVar) {
        this.d = map;
        this.a = new Object();
        this.c = new LinkedHashMap();
        byzVar.r(1, new ea(this, 9, null));
        qrh qrhVarE = e();
        if (qrhVarE != null) {
            this.b = qrhVarE;
        } else {
            throw new IllegalStateException("Failed to load the default backend for CameraBackendId(value=CXCP-Camera2)! Available backends are " + map.keySet());
        }
    }

    public cey(bvm bvmVar, cbg cbgVar, yq yqVar) {
        this.c = bvmVar;
        this.a = cbgVar;
        this.b = yqVar;
        this.d = new zo(2);
    }

    public cey() {
        this.a = null;
        this.b = new zd(16);
        long[] jArr = zv.a;
        this.d = new zu((byte[]) null);
        this.c = new chp();
    }
}
