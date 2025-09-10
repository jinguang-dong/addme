package com.google.android.libraries.social.licenses;

import android.os.Bundle;
import android.view.MenuItem;
import com.google.ar.core.R;
import defpackage.ai;
import defpackage.ch;
import defpackage.dx;
import defpackage.nj;
import defpackage.rby;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LicenseMenuActivity extends dx {
    @Override // defpackage.bp, defpackage.nh, defpackage.dj, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        nj.a(this);
        super.onCreate(bundle);
        setContentView(R.layout.libraries_social_licenses_license_menu_activity);
        if (h() != null) {
            h().g(true);
        }
        ch chVarEo = eo();
        if (chVarEo.d(R.id.license_menu_fragment_container) instanceof rby) {
            return;
        }
        rby rbyVar = new rby();
        ai aiVar = new ai(chVarEo);
        aiVar.m(R.id.license_menu_fragment_container, rbyVar);
        aiVar.c();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
