package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.ui.eduimageview.EduImageView;
import com.google.ar.core.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mno extends ki {
    public int d;
    private final List e;
    private final int f;

    public mno(List list, int i) {
        this.e = list;
        this.f = i;
    }

    @Override // defpackage.ki
    public final int a() {
        return this.e.size();
    }

    @Override // defpackage.ki
    public final /* bridge */ /* synthetic */ lg d(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.page, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.example_images_view);
        int i2 = this.f;
        FrameLayout[] frameLayoutArr = new FrameLayout[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            frameLayoutArr[i3] = new FrameLayout(viewGroup.getContext());
            View.inflate(viewGroup.getContext(), R.layout.image_page, frameLayoutArr[i3]);
            linearLayout.addView(frameLayoutArr[i3]);
            frameLayoutArr[i3].setVisibility(8);
        }
        return new mnr(viewInflate, frameLayoutArr);
    }

    @Override // defpackage.ki
    public final /* bridge */ /* synthetic */ void i(lg lgVar, int i) throws Resources.NotFoundException {
        mnr mnrVar = (mnr) lgVar;
        mnn mnnVar = (mnn) this.e.get(i);
        TextView textView = mnrVar.s;
        String str = mnnVar.a;
        textView.setText(str);
        mnrVar.t.setText(mnnVar.b);
        View view = mnrVar.v;
        boolean z = mnnVar.g;
        view.setVisibility(8);
        View[] viewArr = mnrVar.u;
        if (viewArr.length > 1) {
            LinearLayout linearLayout = mnrVar.w;
            int dimensionPixelSize = linearLayout.getContext().getResources().getDimensionPixelSize(R.dimen.image_container_horizontal_padding);
            linearLayout.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        }
        for (View view2 : viewArr) {
            TextView textView2 = (TextView) view2.findViewById(R.id.caption_after_effect);
            TextView textView3 = (TextView) view2.findViewById(R.id.caption_before_effect);
            LinearLayout linearLayout2 = (LinearLayout) view2.findViewById(R.id.linearlayout_caption);
            textView2.setText(str);
            textView3.setText(mnnVar.f);
            view2.setVisibility(0);
            linearLayout2.setVisibility(4);
        }
        mnrVar.y = mnnVar;
    }

    @Override // defpackage.ki
    public final /* bridge */ /* synthetic */ void j(lg lgVar) {
        final mnr mnrVar = (mnr) lgVar;
        mnn mnnVar = mnrVar.y;
        mnnVar.getClass();
        View[] viewArr = mnrVar.u;
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = null;
            if (i >= viewArr.length) {
                final AmbientMode.AmbientController ambientController = new AmbientMode.AmbientController(this, bArr);
                mnrVar.x.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: mnq
                    @Override // android.view.View.OnScrollChangeListener
                    public final void onScrollChange(View view, int i3, int i4, int i5, int i6) {
                        HorizontalScrollView horizontalScrollView = mnrVar.x;
                        int width = horizontalScrollView.getChildAt(0).getWidth() - horizontalScrollView.getWidth();
                        float scrollX = horizontalScrollView.getScrollX();
                        mno mnoVar = (mno) ambientController.a;
                        mnoVar.d = Math.max(mnoVar.d, (int) ((scrollX / width) * 100.0f));
                    }
                });
                return;
            }
            View view = viewArr[i];
            EduImageView eduImageView = (EduImageView) view.findViewById(R.id.gif_sxs);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.linearlayout_caption);
            List list = mnnVar.c;
            if (((rwc) ((obu) list.get(i2)).b).h()) {
                eduImageView.e((String) ((rwc) ((obu) list.get(i2)).b).c(), mnnVar.d, new oge((Object) linearLayout, (Object) eduImageView, bArr));
                i2++;
            } else if (((rwc) ((obu) list.get(i2)).a).h()) {
                eduImageView.b((Drawable) ((rwc) ((obu) list.get(i2)).a).c(), mnnVar.e);
                i2++;
            }
            i++;
        }
    }
}
