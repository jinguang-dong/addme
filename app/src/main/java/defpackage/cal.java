package defpackage;

import android.view.View;
import com.google.ar.core.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cal {
    public static final Map a = new LinkedHashMap();

    public static final ayk a(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof ayk) {
            return (ayk) tag;
        }
        return null;
    }

    public static final void b(View view, ayk aykVar) {
        view.setTag(R.id.androidx_compose_ui_view_composition_context, aykVar);
    }
}
