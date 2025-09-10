package com.google.android.libraries.social.licenses;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.Layout;
import android.view.MenuItem;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.ar.core.R;
import defpackage.dx;
import defpackage.ng;
import defpackage.nj;
import defpackage.qsp;
import defpackage.rbw;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LicenseActivity extends dx {
    @Override // defpackage.bp, defpackage.nh, defpackage.dj, android.app.Activity
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException, IOException {
        nj.a(this);
        super.onCreate(bundle);
        setContentView(R.layout.libraries_social_licenses_license_activity);
        rbw rbwVar = (rbw) getIntent().getParcelableExtra("license");
        if (h() != null) {
            h().i(rbwVar.a);
            h().r();
            h().g(true);
            h().t();
        }
        TextView textView = (TextView) findViewById(R.id.license_activity_textview);
        String strH = qsp.h(this, "third_party_licenses", rbwVar.b, rbwVar.c);
        if (strH == null) {
            finish();
        } else {
            textView.setText(strH);
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        ScrollView scrollView = (ScrollView) findViewById(R.id.license_activity_scrollview);
        int i = bundle.getInt("scroll_pos");
        if (i != 0) {
            scrollView.post(new ng(this, i, scrollView, 18));
        }
    }

    @Override // defpackage.nh, defpackage.dj, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ScrollView scrollView = (ScrollView) findViewById(R.id.license_activity_scrollview);
        Layout layout = ((TextView) findViewById(R.id.license_activity_textview)).getLayout();
        if (layout != null) {
            bundle.putInt("scroll_pos", layout.getLineStart(layout.getLineForVertical(scrollView.getScrollY())));
        }
    }
}
