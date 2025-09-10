package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.apps.camera.wear.wearappv2.elapsedtimer.ComposeElapsedTimerUi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nrj extends cnn {
    final /* synthetic */ ComposeElapsedTimerUi a;

    public nrj(ComposeElapsedTimerUi composeElapsedTimerUi) {
        this.a = composeElapsedTimerUi;
    }

    @Override // defpackage.cnn
    public final boolean h(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        viewGroup.getClass();
        view.getClass();
        accessibilityEvent.getClass();
        if (accessibilityEvent.getEventType() != 128) {
            if (accessibilityEvent.getEventType() == 32768) {
                return super.h(viewGroup, view, accessibilityEvent);
            }
            ComposeElapsedTimerUi.e();
            throw null;
        }
        ComposeElapsedTimerUi composeElapsedTimerUi = this.a;
        ComposeElapsedTimerUi.e();
        composeElapsedTimerUi.getContext();
        ComposeElapsedTimerUi.e();
        throw null;
    }
}
