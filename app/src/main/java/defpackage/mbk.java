package defpackage;

import com.google.ar.core.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mbk implements mcw {
    private final pbn a;
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final mbj c;

    public mbk(mbj mbjVar, pbn pbnVar) {
        this.c = mbjVar;
        this.a = pbnVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, pbn] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.getAndSet(true)) {
            return;
        }
        pbn pbnVar = this.a;
        pbnVar.f("AudioInit");
        mbj mbjVar = this.c;
        ?? r1 = mbjVar.b;
        r1.f("Sounds#shutter");
        mbq mbqVar = (mbq) mbjVar.c;
        mbqVar.b(R.raw.camera_shutter);
        r1.h("Sounds#video_start");
        mbqVar.b(R.raw.video_start);
        r1.g();
        pbnVar.g();
    }
}
