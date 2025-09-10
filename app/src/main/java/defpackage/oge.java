package defpackage;

import android.app.Dialog;
import android.content.Context;
import com.google.android.clockwork.common.wearable.wearmaterial.list.CaNf.PJGqOKsIpSdZ;
import com.google.googlex.gcam.GrayImageS16;
import com.google.googlex.gcam.ShotMetadata;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oge {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public oge() {
        throw null;
    }

    public final void a() {
        ((ofq) ((kha) this.b).a).b();
        Dialog dialog = (Dialog) this.a;
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
    }

    public final void b() {
        out.a();
        mjl mjlVar = (mjl) this.b;
        ovx ovxVar = mjlVar.l;
        if (((mii) ovxVar.d).equals(mii.STATE_RECORDING) || ((mii) ovxVar.d).equals(mii.STATE_RECORDING_PAUSE)) {
            mjlVar.j(1);
        } else if (((mii) ovxVar.d).equals(mii.STATE_IDLE)) {
            mjlVar.g();
        } else {
            ((sgt) mjl.a.c().M(4881)).v("Recording state is incorrect. State: %s", ((mii) ovxVar.d).name());
        }
    }

    public final void c(iby ibyVar, GrayImageS16 grayImageS16, ShotMetadata shotMetadata) {
        ldr ldrVar = (ldr) this.a;
        ibi ibiVar = (ibi) ldrVar.b.c();
        ldn ldnVar = new ldn(grayImageS16, shotMetadata, 0);
        iwh iwhVar = new iwh(5);
        iea ieaVarB = ibyVar != null ? ibyVar.p : iea.b(idz.ZOOM, 1, sfc.a);
        ldrVar.e.a(ibiVar, ldnVar, iwhVar, (gga) this.b, ieaVarB);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:223:0x048f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(long r34, defpackage.fuw r36) {
        /*
            Method dump skipped, instructions count: 1860
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oge.d(long, fuw):void");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, uqx] */
    public final void e(Object obj) {
        dzy dzyVar = (dzy) this.b;
        this.a.T().j(dzyVar.e(obj) ? new dzo(dzyVar.d()) : dzn.a);
    }

    public oge(Context context) {
        this.b = context;
        this.a = PJGqOKsIpSdZ.OGcyQuhQ;
    }

    public oge(dzy dzyVar, uqx uqxVar) {
        this.b = dzyVar;
        this.a = uqxVar;
    }

    public oge(Object obj, Object obj2) {
        this.a = obj2;
        this.b = obj;
    }

    public /* synthetic */ oge(Object obj, Object obj2, byte[] bArr) {
        this.a = obj;
        this.b = obj2;
    }

    public oge(Object obj, Object obj2, char[] cArr) {
        this.b = obj2;
        this.a = obj;
    }

    public /* synthetic */ oge(Object obj, Object obj2, short[] sArr) {
        this.b = obj;
        this.a = obj2;
    }
}
