package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class muc extends View.AccessibilityDelegate {
    final /* synthetic */ mud a;

    public muc(mud mudVar) {
        this.a = mudVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        mud mudVar = this.a;
        mudVar.d.setContentDescription(view.getResources().getString(R.string.accessibility_elapsed_recording_time_description, mud.o(mudVar.f)));
        mudVar.e.setContentDescription(view.getResources().getString(R.string.accessibility_video_output_length_description, mud.o(mudVar.g)));
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 128) {
            mud mudVar = this.a;
            mudVar.d.setContentDescription(viewGroup.getResources().getString(true != mudVar.h ? R.string.accessibility_elapsed_recording_time_description : R.string.accessibility_paused_elapsed_recording_time_description, mud.o(mudVar.f)));
            mudVar.e.setContentDescription(viewGroup.getResources().getString(R.string.accessibility_video_output_length_description, mud.o(mudVar.g)));
        }
        return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
}
