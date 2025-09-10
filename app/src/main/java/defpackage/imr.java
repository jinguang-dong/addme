package defpackage;

import android.app.Activity;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class imr implements tzt {
    private final iso a;

    public imr(iso isoVar) {
        this.a = isoVar;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Intent a() {
        Intent intent = ((Activity) this.a.b).getIntent();
        intent.getClass();
        return intent;
    }
}
