package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pjx implements pju {
    private final CameraManager a;
    private final pbc b;

    public pjx(CameraManager cameraManager, pbc pbcVar) {
        this.a = cameraManager;
        this.b = pbcVar.a("DefaultCamIdsPrdr");
    }

    @Override // defpackage.pju
    public final List a() throws CameraAccessException {
        try {
            String[] cameraIdList = this.a.getCameraIdList();
            cameraIdList.getClass();
            int length = cameraIdList.length;
            if (length == 0) {
                this.b.d("No cameras available");
                throw new pjw();
            }
            ArrayList arrayList = new ArrayList(length);
            for (String str : cameraIdList) {
                arrayList.add(pjr.b(str));
            }
            return sbp.j(arrayList);
        } catch (CameraAccessException e) {
            this.b.d("Unable to read camera list.");
            throw new pjv("Unable to read camera list.", e.getReason(), e);
        }
    }

    @Override // defpackage.pju
    public final List b() {
        int i = sbp.d;
        return sex.a;
    }
}
