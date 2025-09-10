package defpackage;

import com.google.android.apps.camera.backup.cNHl.ibINv;
import com.google.android.apps.camera.focusindicator.CIAk.YyLACfm;
import com.google.android.apps.camera.jni.facebeautification.GFS.CZAHo;
import com.google.vr.audio.Cf.qcjAcSmlN;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class phk {
    public final pmv a;
    public final pmv b;
    public final pmv c;
    public final pmv d;
    public final pmv e;
    public final pmv f;
    public final pmv g;
    public final pmv h;
    public final pmv i;
    final /* synthetic */ mwq j;

    public phk(mwq mwqVar) {
        this.j = mwqVar;
        this.a = ((pna) mwqVar.a).b(ibINv.VvwRWtkjLkuL, new pmq("camera_id", String.class));
        this.b = ((pna) mwqVar.a).c("/pck/frameserver/frameserver_open_durations_ns", new pmq("camera_id", String.class));
        this.c = ((pna) mwqVar.a).b("/pck/frameserver/frame_stream_count", new pmq("camera_id", String.class), new pmq("stream_count", Integer.class), new pmq("parameter_count", Integer.class));
        this.d = ((pna) mwqVar.a).b("/pck/frameserver/framebuffer_acquire_count", new pmq[0]);
        this.e = ((pna) mwqVar.a).b("/pck/frameserver/framebuffer_release_count", new pmq[0]);
        ((pna) mwqVar.a).b(CZAHo.Otv, new pmq("burst_size", Integer.class), new pmq("repeating", Boolean.class));
        ((pna) mwqVar.a).b("/pck/frameserver/request_abort", new pmq[0]);
        this.f = ((pna) mwqVar.a).b("/pck/frameserver/stream_count", new pmq("camera_id", String.class), new pmq(YyLACfm.KhVLogOpHQSUpw, String.class), new pmq("format", Integer.class), new pmq("width", Integer.class), new pmq("height", Integer.class), new pmq("capacity", Integer.class));
        this.g = ((pna) mwqVar.a).b(qcjAcSmlN.jlyGEh, new pmq("width", Integer.class), new pmq("height", Integer.class), new pmq("format", Integer.class));
        this.h = ((pna) mwqVar.a).b("/pck/frameserver/image_release_count", new pmq("width", Integer.class), new pmq("height", Integer.class), new pmq("format", Integer.class));
        this.i = ((pna) mwqVar.a).c("/pck/frameserver/image_timestamp_delta", new pmq("camera_id", String.class), new pmq("width", Integer.class), new pmq("height", Integer.class), new pmq("format", Integer.class), new pmq("max_images", Integer.class));
    }
}
