package defpackage;

import android.content.Context;
import android.view.View;
import com.google.ar.core.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmv extends mnp implements gmx {
    public static final Integer a = 1;
    private final hbj b;

    public gmv(Context context, mni mniVar, hbj hbjVar) {
        super(context, mniVar);
        this.b = hbjVar;
    }

    @Override // defpackage.gmx
    public final void a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Context context = this.d;
        arrayList.add(new mnn(context.getString(R.string.stabilization_edu_standard_title), context.getString(R.string.stabilization_edu_standard_subtitle), sbp.l(obu.i("https://www.gstatic.com/aiux/gca/stabilization/Standard_EDUPanel_376x320.gif")), context.getString(R.string.stabilization_edu_standard_sidebyside_video_announcement), context.getString(R.string.stabilization_edu_caption_unstabilized)));
        arrayList2.add(context.getString(R.string.stabilization_edu_tab_label_standard));
        hbj hbjVar = this.b;
        if (hbjVar.p(gym.R)) {
            arrayList.add(new mnn(context.getString(R.string.stabilization_edu_locked_title), context.getString(R.string.stabilization_edu_locked_subtitle), sbp.l(obu.i("https://www.gstatic.com/aiux/gca/stabilization/Locked_EDUPanel_376x320.gif")), context.getString(R.string.stabilization_edu_locked_sidebyside_video_announcement), context.getString(R.string.stabilization_edu_caption_unstabilized)));
            arrayList2.add(context.getString(R.string.stabilization_edu_tab_label_locked));
        }
        if (hbjVar.p(gym.S)) {
            arrayList.add(new mnn(context.getString(R.string.stabilization_edu_active_title), context.getString(R.string.stabilization_edu_active_subtitle), sbp.l(obu.i("https://www.gstatic.com/aiux/gca/stabilization/Active_EDUPanel_376x320.gif")), context.getString(R.string.stabilization_edu_active_sidebyside_video_announcement), context.getString(R.string.stabilization_edu_caption_unstabilized)));
            arrayList2.add(context.getString(R.string.stabilization_edu_tab_label_active));
        }
        View viewB = b();
        a.intValue();
        c(viewB, arrayList, 1, new gmu(), new iuu(arrayList2, 1));
        d(3, viewB, null);
    }
}
