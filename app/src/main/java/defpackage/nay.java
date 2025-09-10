package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nay {
    public final Context a;
    public final View b;
    public final int c;
    public final int d;
    public final Rect e = new Rect();

    public nay(Context context, View view) {
        this.a = context;
        this.b = view;
        this.c = context.getResources().getInteger(R.integer.hide_notification_dot_animation_delay);
        this.d = context.getResources().getInteger(R.integer.hide_notification_dot_animation_duration);
    }
}
