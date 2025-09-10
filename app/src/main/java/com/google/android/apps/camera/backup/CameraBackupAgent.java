package com.google.android.apps.camera.backup;

import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.os.ParcelFileDescriptor;
import android.preference.PreferenceManager;
import defpackage.fvi;
import defpackage.ink;
import defpackage.mdy;
import defpackage.nwj;
import defpackage.oug;
import defpackage.sbv;
import defpackage.soc;
import defpackage.sod;
import defpackage.stc;
import defpackage.tpc;
import defpackage.tph;
import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CameraBackupAgent extends oug {
    public mdy a;

    private final void e() {
        if (this.a == null) {
            ((fvi) ((ink) getApplicationContext()).d(fvi.class)).a(this);
        }
    }

    @Override // defpackage.oug
    protected final Map a() {
        return sbv.n(PreferenceManager.getDefaultSharedPreferencesName(this), new nwj());
    }

    @Override // defpackage.oug, android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public final void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) throws IOException {
        super.onBackup(parcelFileDescriptor, backupDataOutput, parcelFileDescriptor2);
        e();
        mdy mdyVar = this.a;
        tpc tpcVarM = sod.a.m();
        soc socVar = soc.PREFERENCES_EVENT;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sod sodVar = (sod) tpcVarM.b;
        sodVar.f = socVar.aJ;
        sodVar.b |= 1;
        tpc tpcVarM2 = stc.a.m();
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        tph tphVar = tpcVarM2.b;
        stc stcVar = (stc) tphVar;
        stcVar.c = 1;
        stcVar.b |= 1;
        if (!tphVar.C()) {
            tpcVarM2.o();
        }
        stc stcVar2 = (stc) tpcVarM2.b;
        stcVar2.d = 1;
        stcVar2.b |= 2;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sod sodVar2 = (sod) tpcVarM.b;
        stc stcVar3 = (stc) tpcVarM2.l();
        stcVar3.getClass();
        sodVar2.B = stcVar3;
        sodVar2.b |= 1073741824;
        mdyVar.I(tpcVarM);
    }

    @Override // defpackage.oug, android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public final void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        super.onRestore(backupDataInput, i, parcelFileDescriptor);
        e();
        mdy mdyVar = this.a;
        tpc tpcVarM = sod.a.m();
        soc socVar = soc.PREFERENCES_EVENT;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sod sodVar = (sod) tpcVarM.b;
        sodVar.f = socVar.aJ;
        sodVar.b |= 1;
        tpc tpcVarM2 = stc.a.m();
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        tph tphVar = tpcVarM2.b;
        stc stcVar = (stc) tphVar;
        stcVar.c = 2;
        stcVar.b |= 1;
        if (!tphVar.C()) {
            tpcVarM2.o();
        }
        stc stcVar2 = (stc) tpcVarM2.b;
        stcVar2.d = 1;
        stcVar2.b |= 2;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sod sodVar2 = (sod) tpcVarM.b;
        stc stcVar3 = (stc) tpcVarM2.l();
        stcVar3.getClass();
        sodVar2.B = stcVar3;
        sodVar2.b |= 1073741824;
        mdyVar.I(tpcVarM);
    }
}
