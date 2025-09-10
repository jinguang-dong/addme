package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mag extends ResolveInfo {
    final /* synthetic */ mah a;
    final /* synthetic */ int b;

    public mag(mah mahVar, int i) {
        this.b = i;
        this.a = mahVar;
    }

    @Override // android.content.pm.ResolveInfo
    public final Drawable loadIcon(PackageManager packageManager) {
        int i = this.b;
        mah mahVar = this.a;
        if (i - 1 != 1) {
            Drawable drawable = mahVar.b.getDrawable(R.drawable.social_app_settings_icon);
            drawable.getClass();
            return drawable;
        }
        Drawable drawable2 = mahVar.b.getDrawable(R.drawable.social_app_black_add_icon);
        drawable2.getClass();
        return drawable2;
    }

    @Override // android.content.pm.ResolveInfo
    public final CharSequence loadLabel(PackageManager packageManager) {
        int i = this.b;
        Context context = this.a.b;
        return i == 2 ? context.getString(R.string.label_add_social_apps) : context.getString(R.string.label_social_share_setting);
    }
}
