package defpackage;

import com.google.android.apps.camera.focusindicator.FocusIndicatorView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hod implements tzt {
    private final tzx a;
    private final tzx b;

    public hod(tzx tzxVar, tzx tzxVar2) {
        this.a = tzxVar;
        this.b = tzxVar2;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final FocusIndicatorView a() {
        FocusIndicatorView focusIndicatorView = (FocusIndicatorView) ((ocq) ((mwq) this.a.a()).b).c(R.id.focus_indicator_view);
        focusIndicatorView.post(new cmc(this.b, focusIndicatorView, 15));
        return focusIndicatorView;
    }
}
