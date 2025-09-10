package defpackage;

import android.content.SharedPreferences;
import com.google.android.apps.camera.camerafatalerror.CameraFatalErrorTrackerDatabase;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gol implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;

    public gol(tzx tzxVar, tzx tzxVar2, tzx tzxVar3) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final got a() {
        return new got((SharedPreferences) this.a.a(), (CameraFatalErrorTrackerDatabase) this.b.a(), ((goe) this.c).a(), null);
    }
}
