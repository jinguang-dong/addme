package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import androidx.preference.Preference;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dan implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {
    private final Preference a;

    public dan(Preference preference) {
        this.a = preference;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Preference preference = this.a;
        CharSequence charSequenceM = preference.m();
        if (!preference.z || TextUtils.isEmpty(charSequenceM)) {
            return;
        }
        contextMenu.setHeaderTitle(charSequenceM);
        contextMenu.add(0, 0, 0, R.string.copy).setOnMenuItemClickListener(this);
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Preference preference = this.a;
        ((ClipboardManager) preference.j.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Preference", preference.m()));
        return true;
    }
}
