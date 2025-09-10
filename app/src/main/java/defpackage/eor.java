package defpackage;

import android.view.View;
import com.google.android.apps.camera.ui.eduimageview.EduImageView;
import com.google.android.apps.camera.ui.preference.DownloadPreference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class eor implements View.OnClickListener {
    private final /* synthetic */ int a;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        if (i == 3) {
            EduImageView.d(view.getContext());
        } else {
            if (i != 4) {
                return;
            }
            int i2 = DownloadPreference.a;
        }
    }
}
