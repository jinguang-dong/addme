package defpackage;

import android.content.Context;
import com.google.ar.core.Session;
import com.google.ar.core.exceptions.UnavailableApkTooOldException;
import com.google.ar.core.exceptions.UnavailableArcoreNotInstalledException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableSdkTooOldException;
import j$.util.Collection;
import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fmp implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;

    public fmp(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [sgt, shi] */
    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Optional a() {
        Context contextB = ((imm) this.a).b();
        hbj hbjVar = (hbj) this.b.a();
        owf owfVar = (owf) this.c.a();
        owq owqVar = (owq) this.d.a();
        ((fmo) this.e).a();
        sgv sgvVar = fml.a;
        if (!hbjVar.o(gyi.h) || ((fne) owfVar.dL()).a()) {
            return Optional.empty();
        }
        try {
            try {
                foy foyVar = new foy(new Session(contextB, (Set) Collection.EL.stream(new sfm(fnq.SHAREABLE_CAMERA)).map(new fik(17)).collect(ryv.b)));
                fok fokVarD = foyVar.d();
                ezh.m(new fjw(foyVar, fokVarD, 6, null));
                owqVar.a(true);
                return Optional.of(foyVar);
            } catch (UnavailableApkTooOldException e) {
                throw new fob(e);
            } catch (UnavailableArcoreNotInstalledException e2) {
                throw new foc(e2);
            } catch (UnavailableDeviceNotCompatibleException e3) {
                throw new fod(e3);
            } catch (UnavailableSdkTooOldException e4) {
                throw new fof(e4);
            } catch (RuntimeException e5) {
                throw ezh.l(e5);
            }
        } catch (fnw | fob | foc | fod | fof e6) {
            ((sgt) ((sgt) fml.a.b().i(e6)).M((char) 276)).s("Missing ARCore.");
            owqVar.a(false);
            return Optional.empty();
        }
    }
}
