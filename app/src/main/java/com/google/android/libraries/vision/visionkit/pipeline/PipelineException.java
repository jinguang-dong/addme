package com.google.android.libraries.vision.visionkit.pipeline;

import com.google.android.apps.camera.rectiface.Iqz.mPfBwqXsnpXI;
import defpackage.rgv;
import defpackage.rha;
import defpackage.rvk;
import defpackage.rwc;
import defpackage.rwr;
import defpackage.sbp;
import defpackage.sex;
import defpackage.tow;
import defpackage.tph;
import defpackage.tra;
import defpackage.ujp;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PipelineException extends Exception {
    private static final String ROOT_CAUSE_DELIMITER = "#vk ";
    private final rgv statusCode;
    private final String statusMessage;
    private final rha visionkitStatus;

    public PipelineException(int i, String str) {
        super(rgv.values()[i].r + ": " + str);
        this.statusCode = rgv.values()[i];
        this.statusMessage = str;
        this.visionkitStatus = null;
    }

    public List getComponentStatuses() {
        rha rhaVar = this.visionkitStatus;
        if (rhaVar != null) {
            return rhaVar.d;
        }
        int i = sbp.d;
        return sex.a;
    }

    public rwc getRootCauseMessage() {
        if (!this.statusMessage.contains(ROOT_CAUSE_DELIMITER)) {
            return rvk.a;
        }
        return rwc.j((String) ujp.aQ(rwr.c(ROOT_CAUSE_DELIMITER).f(this.statusMessage)));
    }

    public rgv getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    private PipelineException(rha rhaVar) {
        super(rgv.values()[rhaVar.b].r + mPfBwqXsnpXI.eBj + rhaVar.c);
        this.statusCode = rgv.values()[rhaVar.b];
        this.statusMessage = rhaVar.c;
        this.visionkitStatus = rhaVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    PipelineException(byte[] bArr) {
        tow towVar = tow.a;
        tra traVar = tra.a;
        tph tphVarQ = tph.q(rha.a, bArr, 0, bArr.length, tow.a);
        tph.D(tphVarQ);
        this((rha) tphVarQ);
    }
}
