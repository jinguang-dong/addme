package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
class gsr extends gsz {
    final /* synthetic */ gsy a;

    public gsr(gsy gsyVar) {
        this.a = gsyVar;
    }

    @Override // defpackage.gsz, defpackage.mcz, defpackage.mda
    public final void a() {
        gqc gqcVar = this.a.c;
        gqcVar.d(1);
        pbn pbnVar = gqcVar.i;
        pbnVar.f("camera_vkp_enable_sub_pipeline");
        grm grmVar = gqcVar.h;
        rnt.w(grmVar, "CameraVisionKitPipeline needs to be initialized first", new Object[0]);
        long j = grmVar.b;
        if (j == 0) {
            Log.w("VKP", "enableSubpipeline called but pipeline is not available. Ignoring call.");
        } else {
            grmVar.a.enableSubpipeline(j, "LazyPipeline");
        }
        pbnVar.g();
    }

    @Override // defpackage.gsz
    public void c() {
        this.a.l.o();
    }
}
