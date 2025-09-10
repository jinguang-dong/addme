package defpackage;

import com.google.googlex.gcam.DirtyLensHistory;
import com.google.googlex.gcam.GcamModuleJNI;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffo implements tzt {
    private final tzx a;

    public ffo(tzx tzxVar) {
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ggg a() {
        ejt ejtVar = (ejt) this.a.a();
        ggg gggVar = new ggg((byte[]) null);
        DirtyLensHistory dirtyLensHistory = (DirtyLensHistory) gggVar.a;
        GcamModuleJNI.DirtyLensHistory_max_photo_count__set(dirtyLensHistory.a, dirtyLensHistory, 32);
        fff fffVar = (fff) ejtVar.a;
        GcamModuleJNI.DirtyLensHistory_weighted_score_threshold__set(dirtyLensHistory.a, dirtyLensHistory, fffVar.a);
        GcamModuleJNI.DirtyLensHistory_initial_score__set(dirtyLensHistory.a, dirtyLensHistory, fffVar.c);
        GcamModuleJNI.DirtyLensHistory_frame_influence_decay_rate__set(dirtyLensHistory.a, dirtyLensHistory, fffVar.b);
        return gggVar;
    }
}
