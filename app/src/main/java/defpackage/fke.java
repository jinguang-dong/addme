package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fke {
    public static final sbv a;
    public final out b;
    public final LayoutInflater c;
    public final ViewGroup d;
    public final Context e;
    public fkf f = fkf.UNKNOWN;
    public PopupWindow g = null;
    public Button h = null;
    public TextView i = null;

    static {
        sbr sbrVar = new sbr();
        sbrVar.f(fkf.DISTANCE, Integer.valueOf(R.string.error_desc_distance));
        sbrVar.f(fkf.UNSUPPORTED_SCENE, Integer.valueOf(R.string.error_desc_unsupported_scene));
        sbrVar.f(fkf.TOO_MANY_PEOPLE, Integer.valueOf(R.string.error_desc_unsupported_count));
        a = sbrVar.b();
    }

    public fke(Context context, ViewGroup viewGroup, out outVar) {
        this.b = outVar;
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        layoutInflater.getClass();
        this.c = layoutInflater;
        this.d = viewGroup;
        this.e = context;
    }

    public final synchronized void a() {
        this.b.execute(new fem(this, 16));
    }

    public final synchronized void b(fkf fkfVar) {
        this.f = fkfVar;
    }
}
