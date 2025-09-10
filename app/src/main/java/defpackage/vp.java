package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Trace;
import com.google.android.apps.camera.autotimer.analysis.jni.wVCD.HHdu;
import com.google.android.apps.camera.jni.gxp.Caan.yoGAhrpjU;
import com.google.android.apps.camera.modeldownloader.uD.uCzt;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vp implements AutoCloseable {
    public final wb a;
    public final wq b;
    public final uly c;
    public final wh d;
    public final sl e;
    private final wr f;
    private final wy g;
    private final wx h;
    private final po i;
    private final rnn j;
    private final ocq k;
    private final ocq l;

    public vp(pl plVar, sm smVar, wh whVar, wb wbVar, wq wqVar, wr wrVar, sl slVar, byi byiVar, wk wkVar, wy wyVar, wx wxVar, rnn rnnVar, po poVar, ocq ocqVar, ocq ocqVar2) throws IOException {
        String strA;
        smVar.getClass();
        whVar.getClass();
        wbVar.getClass();
        wqVar.getClass();
        wrVar.getClass();
        slVar.getClass();
        byiVar.getClass();
        wkVar.getClass();
        wyVar.getClass();
        wxVar.getClass();
        rnnVar.getClass();
        poVar.getClass();
        ocqVar.getClass();
        ocqVar2.getClass();
        this.d = whVar;
        this.a = wbVar;
        this.b = wqVar;
        this.f = wrVar;
        this.e = slVar;
        this.g = wyVar;
        this.h = wxVar;
        this.j = rnnVar;
        this.i = poVar;
        this.k = ocqVar;
        this.l = ocqVar2;
        int i = vt.a;
        int i2 = 0;
        this.c = new uly(false, umc.a);
        String strCa = ske.ca(plVar.m, null, null, null, null, 63);
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
        key.getClass();
        Integer num = (Integer) smVar.a(key);
        String str = yoGAhrpjU.wOKWSSajbYVyryh;
        String str2 = (num != null && num.intValue() == 0) ? "Front" : (num != null && num.intValue() == 1) ? "Back" : (num != null && num.intValue() == 2) ? "External" : str;
        int i3 = plVar.g;
        if (a.p(i3, 1)) {
            str = "High Speed";
        } else if (a.p(i3, 0)) {
            str = "Normal";
        } else if (a.p(i3, 2)) {
            str = "Extension";
        }
        CameraCharacteristics.Key key2 = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        key2.getClass();
        int[] iArr = (int[]) smVar.a(key2);
        String str3 = (iArr == null || !rnt.as(iArr, 11)) ? "Physical" : "Logical";
        StringBuilder sb = new StringBuilder();
        sb.append(this + " (Camera " + plVar.a + ")\n");
        if (strCa.length() > 0) {
            sb.append("  Shared:    " + strCa + '\n');
        }
        sb.append(a.by(str3, str2, "  Facing:    ", " (", ")\n"));
        sb.append("  Mode:      " + str + '\n');
        sb.append("Outputs:\n");
        Iterator it = wqVar.j.iterator();
        while (it.hasNext()) {
            int i4 = i2;
            for (Object obj : ((pv) it.next()).b) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    ske.bp();
                }
                wo woVar = (wo) obj;
                sb.append("  ");
                if (i4 == 0) {
                    pv pvVar = woVar.k;
                    if (pvVar == null) {
                        ujp.c(uCzt.AIIGzBtyzw);
                        pvVar = null;
                    }
                    strA = rh.a(pvVar.a);
                } else {
                    strA = "";
                }
                sb.append(ujp.w(strA, 12));
                sb.append(ujp.w(qo.a(woVar.a), 12));
                String string = woVar.b.toString();
                string.getClass();
                sb.append(ujp.w(string, 12));
                sb.append(ujp.w(rf.a(woVar.c), 16));
                qu quVar = woVar.e;
                if (quVar != null) {
                    sb.append(" [" + ((Object) qu.a(quVar.a)) + ']');
                }
                qz qzVar = woVar.f;
                if (qzVar != null) {
                    sb.append(" [" + ((Object) qz.a(qzVar.a)) + ']');
                }
                qt qtVar = woVar.g;
                if (qtVar != null) {
                    sb.append(" [" + ((Object) qt.a(qtVar.a)) + ']');
                }
                qx qxVar = woVar.h;
                if (qxVar != null) {
                    sb.append(" [" + ((Object) qx.a(qxVar.a)) + ']');
                }
                if (woVar.j != null) {
                    sb.append(" [StreamUseHint(value=1)]");
                }
                if (!a.ao(woVar.d, plVar.a)) {
                    sb.append(" [");
                    sb.append(new pp(woVar.d));
                    sb.append("]");
                }
                sb.append("\n");
                i4 = i5;
                i2 = 0;
            }
        }
        if (!this.b.i.isEmpty()) {
            sb.append(HHdu.nkeSWE);
            for (cbd cbdVar : this.b.i) {
                sb.append(" ");
                sb.append(ujp.w(ql.a(cbdVar.a), 12));
                sb.append(ujp.w(rf.b(cbdVar.b), 12));
                sb.append(ujp.w("20", 12));
                sb.append("\n");
            }
        }
        sb.append("Session Template: TEMPLATE_PREVIEW\n");
        byi.bu(sb, "Session Parameters", plVar.f);
        sb.append("Default Template: TEMPLATE_PREVIEW\n");
        byi.bu(sb, "Default Parameters", plVar.i);
        byi.bu(sb, "Required Parameters", plVar.k);
        if (a.p(plVar.g, 1)) {
            if (this.b.k.isEmpty()) {
                throw new IllegalArgumentException("Cannot create a HIGH_SPEED CameraGraph without outputs.");
            }
            if (this.b.k.size() > 2) {
                List list = this.b.k;
                Objects.toString(list);
                throw new IllegalArgumentException("Cannot create a HIGH_SPEED CameraGraph with more than two outputs. Configured outputs are ".concat(String.valueOf(list)));
            }
            List list2 = this.b.k;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (!((wo) it2.next()).a()) {
                        List list3 = this.b.k;
                        Objects.toString(list3);
                        throw new IllegalArgumentException("HIGH_SPEED CameraGraph must only contain Preview and/or Video streams. Configured outputs are ".concat(String.valueOf(list3)));
                    }
                }
            }
        }
        List list4 = plVar.d;
        if (list4 != null && list4.isEmpty()) {
            throw new IllegalArgumentException("At least one InputConfiguration is required for reprocessing");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.uhb r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.vo
            if (r0 == 0) goto L13
            r0 = r5
            vo r0 = (defpackage.vo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            vo r0 = new vo
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.rnt.aN(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.rnt.aN(r5)
            ocq r5 = r4.l
            r0.c = r3
            java.lang.Object r5 = r5.aM(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            wh r0 = r4.d
            ocq r4 = r4.k
            vj r5 = (defpackage.vj) r5
            vq r1 = new vq
            r1.<init>(r5, r0, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vp.a(uhb):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x013a, code lost:
    
        r8 = defpackage.ufx.a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(int r8, android.view.Surface r9) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vp.b(int, android.view.Surface):void");
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        if (this.c.b()) {
            toString();
            Trace.beginSection(toString().concat("#close"));
            toString();
            this.d.d();
            this.e.c();
            this.g.close();
            this.h.close();
            this.f.close();
            rnn rnnVar = this.j;
            synchronized (rnnVar.d) {
                int iE = rnnVar.e();
                rnnVar.c.remove(this);
                rnnVar.g(new pb(iE));
            }
            Trace.endSection();
        }
    }

    public final String toString() {
        return this.i.b;
    }
}
