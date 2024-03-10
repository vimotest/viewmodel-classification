# Poor Reusability of ViewModels

ViewModels often centralize a lot of view-specific code, like formatting certain information in a certain way. Sometimes, such logic might be needed also in other ViewModels, where code-sharing cannot be done directly. This might lead to copy-paste code.

