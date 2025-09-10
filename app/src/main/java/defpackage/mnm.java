package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mnm {
    private final mni a;
    private final Context b;
    private View c = null;
    private final luj d;
    private final hbj e;

    public mnm(mni mniVar, luj lujVar, Context context, hbj hbjVar) {
        this.a = mniVar;
        this.d = lujVar;
        this.b = context;
        this.e = hbjVar;
    }

    public final void a() {
        out.a();
        if (this.c == null) {
            Context context = this.b;
            FrameLayout frameLayout = new FrameLayout(context);
            TextView textView = (TextView) View.inflate(context, R.layout.raw_jpeg_bottom_sheet, frameLayout).findViewById(R.id.raw_output_details_text_view);
            if (this.e.p(haj.a)) {
                textView.setText(R.string.raw_output_in_raw_images_folder_control_bottom_sheet_content);
            }
            this.c = frameLayout;
        }
        this.a.m(24, R.string.raw_output_control_bottom_sheet_title, this.c);
        this.d.d(luf.aV, true);
    }
}
