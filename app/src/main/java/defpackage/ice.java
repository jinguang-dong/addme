package defpackage;

import com.google.googlex.gcam.BuildPayloadBurstSpecOptions;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.ViewfinderProcessingOptions;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ice implements rww {
    private final iao a;
    private final hxy b;
    private final tcn c;
    private final hxd d;
    private final ibb e;
    private final owf f;
    private final boolean g;
    private final hbj h;

    public ice(iao iaoVar, hbj hbjVar, hxy hxyVar, tcn tcnVar, hxd hxdVar, ibb ibbVar, owf owfVar, boolean z) {
        this.a = iaoVar;
        this.h = hbjVar;
        this.b = hxyVar;
        this.c = tcnVar;
        this.d = hxdVar;
        this.e = ibbVar;
        this.f = owfVar;
        this.g = z;
    }

    @Override // defpackage.rww
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ViewfinderProcessingOptions fr() {
        ViewfinderProcessingOptions viewfinderProcessingOptions = new ViewfinderProcessingOptions();
        ibb ibbVar = this.e;
        if (ibbVar.j()) {
            GcamModuleJNI.ViewfinderProcessingOptions_motion_processing_method_set(viewfinderProcessingOptions.a, viewfinderProcessingOptions, this.c.c);
            GcamModuleJNI.ViewfinderProcessingOptions_process_gyro_set(viewfinderProcessingOptions.a, viewfinderProcessingOptions, true);
            if (ibbVar.g()) {
                GcamModuleJNI.ViewfinderProcessingOptions_compute_payload_capture_time_set(viewfinderProcessingOptions.a, viewfinderProcessingOptions, true);
                hxd hxdVar = this.d;
                hxdVar.c = true;
                hxdVar.b = false;
                hxdVar.f = ibbVar.m();
                hxdVar.o = Optional.of((Integer) this.f.dL());
                BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptionsA = hxdVar.a();
                GcamModuleJNI.ViewfinderProcessingOptions_burst_spec_options_set(viewfinderProcessingOptions.a, viewfinderProcessingOptions, buildPayloadBurstSpecOptionsA.a, buildPayloadBurstSpecOptionsA);
                if (((iba) ibbVar.dL()).equals(iba.V1)) {
                    GcamModuleJNI.ViewfinderProcessingOptions_compute_psaf_capture_time_set(viewfinderProcessingOptions.a, viewfinderProcessingOptions, true);
                }
                GcamModuleJNI.ViewfinderProcessingOptions_will_capture_max_res_set(viewfinderProcessingOptions.a, viewfinderProcessingOptions, this.g);
            }
        }
        gzi gziVar = gzs.a;
        GcamModuleJNI.ViewfinderProcessingOptions_verbose_set(viewfinderProcessingOptions.a, viewfinderProcessingOptions, false);
        GcamModuleJNI.ViewfinderProcessingOptions_save_motion_trace_set(viewfinderProcessingOptions.a, viewfinderProcessingOptions, this.b.e(this.a));
        return viewfinderProcessingOptions;
    }
}
