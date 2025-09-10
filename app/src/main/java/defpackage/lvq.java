package defpackage;

import android.content.res.Resources;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lvq extends owx {
    private final ryq a;

    public lvq(Resources resources, luj lujVar) {
        super(lujVar.a(luf.j));
        this.a = sbc.c(lvp.SHUTTER, resources.getString(R.string.preference_volume_key_shutter), lvp.ZOOM, resources.getString(R.string.preference_volume_key_zoom), lvp.VOLUME, resources.getString(R.string.preference_volume_key_volume), lvp.d, resources.getString(R.string.preference_volume_key_off));
    }

    @Override // defpackage.owx
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        lvp lvpVar = (lvp) ((sew) this.a).c.get((String) obj);
        return lvpVar != null ? lvpVar : lvp.SHUTTER;
    }

    @Override // defpackage.owx
    protected final /* bridge */ /* synthetic */ Object c(Object obj) {
        String str = (String) this.a.get((lvp) obj);
        rnt.x(str);
        return str;
    }
}
